package com.enmusushi.controller;

import com.enmusushi.config.ConfigInfo;
import com.enmusushi.mapdata.QueryMapDataService;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Admin
 */
@Controller
public class QueryDataController {
    @Resource
    private ConfigInfo configInfo;

    private int anInt = 0;
    private Integer intCount = new Integer(0);
    private final AtomicLong counter = new AtomicLong();

    @ResponseBody
    @RequestMapping("/index")
    public String queryData() {
        QueryMapDataService service = new QueryMapDataService();
        //service.saveFileFromURL(configInfo.getDataUrl(), configInfo.getFilePath());
        try {
            String content = service.queryDataFromURL(configInfo.getDataUrl());
            String preUrl = configInfo.getDataUrl().substring(0, configInfo.getDataUrl().lastIndexOf("=") + 1);
            service.analysisGeoJson(content, preUrl, configInfo.getFilePath());
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return configInfo.getDataUrl();
    }

    @ResponseBody
    @RequestMapping("/count")
    public String count(@RequestParam(value = "name", defaultValue = "test") String name) {
        return name + " : anInt=" + (anInt++) + ",intCount=" + (intCount++) + ", AtomicLong =" + counter.incrementAndGet();
    }


}
