package com.enmusushi.controller;

import com.enmusushi.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Admin
 */
@RestController
public class IndexController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name ", defaultValue = "DaLao") String name) {
        return new Greeting(counter.incrementAndGet(), name);
    }

    @GetMapping("/index")
    public String index() {
        String json = "{\n" +
                "   \"type\": \"success\",\n" +
                "   \"value\": {\n" +
                "      \"id\": 10,\n" +
                "      \"quote\": \"Really loving Spring Boot, makes stand alone Spring apps easy.\"\n" +
                "   }\n" +
                "}";

        System.out.println(json);
        return json;

    }

    @GetMapping("/simpleJson")
    public String simpleJson() {
        String simpleJson = "{ \"type\": \"success\", \"value\": { \"id\": 10, \"quote\": \"Really loving Spring Boot, makes stand alone Spring apps easy.\" } }";
        System.out.println(simpleJson);
        return simpleJson;
    }

}
