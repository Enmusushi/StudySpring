package com.enmusushi.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class ConsumingRest {
    private static final Logger logger = LoggerFactory.getLogger(ConsumingRest.class);
    private String userStr = "{\"ESB\":{\"DATA\":{\"DATAINFOS\":{\"DATAINFO\":[{\"CODE\":\"1151793\",\"CODEID\":\"20996951\",\"DESC1\":\"杨玺\",\"DESC10\":\"300100905\",\"DESC11\":\"\",\"DESC12\":\"男\",\"DESC13\":\"1984-08-11\",\"DESC14\":\"黑龙江哈尔滨\",\"DESC15\":\"汉族\",\"DESC16\":\"230103198408114815\",\"DESC17\":\"2020-03-16\",\"DESC18\":\"2020-03-16\",\"DESC19\":\"100002\",\"DESC2\":\"57CA3211-243F-4E3A-B3ED-6B20D0D8E8E5\",\"DESC20\":\"北京\",\"DESC21\":\"品牌经理\",\"DESC22\":\"试用工\",\"DESC23\":\"外埠城镇\",\"DESC24\":\"黑龙江省哈尔滨市南岗区国庆街7号\",\"DESC25\":\"18612961602\",\"DESC26\":\"\",\"DESC27\":\"北京市通州区\",\"DESC28\":\"\",\"DESC29\":\"\",\"DESC3\":\"100015\",\"DESC30\":\"哈尔滨师范大学\",\"DESC31\":\"新闻传播\",\"DESC32\":\"2002-09-01\",\"DESC33\":\"2006-07-01\",\"DESC34\":\"本科\",\"DESC35\":\"本科\",\"DESC36\":\"\",\"DESC37\":\"新闻传播、摄影摄像\",\"DESC38\":\"英语四级\",\"DESC39\":\"\",\"DESC4\":\"物业管理集团机关\",\"DESC40\":\"2020-03-16\",\"DESC41\":\"2020-03-16\",\"DESC42\":\"群众\",\"DESC43\":\"yx\",\"DESC44\":\"yangxi6@icentown.com\",\"DESC45\":\"\",\"DESC46\":\"\",\"DESC47\":\"13\",\"DESC48\":\"\",\"DESC49\":\"yangxi6\",\"DESC5\":\"100002\",\"DESC50\":\"24DD370BAD3588343DD4EA6FB2F0B258\",\"DESC51\":\"\",\"DESC52\":\"\",\"DESC53\":\"正常\",\"DESC54\":\"\",\"DESC55\":\"0\",\"DESC56\":\"yangxi6@icentown.com\",\"DESC57\":\"\",\"DESC58\":\"\",\"DESC59\":\"\",\"DESC6\":\"物业产业\",\"DESC60\":\"\",\"DESC61\":\"\",\"DESC62\":\"3001009\",\"DESC63\":\"3001\",\"DESC64\":\"B2F1E5B9-26CB-4F9D-8CAF-39D63E00FF7B\",\"DESC65\":\"\",\"DESC66\":\"\",\"DESC67\":\"\",\"DESC7\":\"100114\",\"DESC8\":\"市场拓展中心\",\"DESC9\":\"品牌经理\",\"UUID\":\"0846106F66BF46DE880AEEFB19458F66\"}],\"PUUID\":\"C23B7E79CBE84390AB175EA20AFADC8E\",\"SYNCODE\":\"mdm_to_wyzl_ry\"}}}}";
    private RestTemplate restTemplate;
    private HttpEntity httpEntity;
    private int taskNum = 30;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        restTemplate = builder.build();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", "Bearer 1564fafe423d442ca3922dbb7733f9e41141095094");
        httpEntity = new HttpEntity(userStr, headers);
        return restTemplate;
    }

    @Bean
    public CommandLineRunner run() {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(15, 20, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        for (int i = 0; i < taskNum; i++) {
            threadPool.execute(new Task());
        }
        return args -> {
        };
    }

    class Task implements Runnable {
        @Override
        public void run() {
            ResponseEntity<String> resultData = restTemplate.postForEntity("http://127.0.0.1:3000/pms/api/oauthaccess/master/userList", httpEntity, String.class);
            System.out.println(Thread.currentThread().getName() + " : " + resultData);
        }
    }

}
