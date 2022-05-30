package com.enmusushi.messagingredis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * @author Admin
 */
@Controller
public class ProcessController {

    @GetMapping("/")
    @ResponseBody
    public String initProcess() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        // 独立环境变量
        Map<String, String> env = processBuilder.environment();
        // 打印环境变量
        System.out.println(env);
        try {
            Process process = processBuilder.command("cmd", "/c", "dir").start();
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream(), "gbk");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Admin";
    }

}
