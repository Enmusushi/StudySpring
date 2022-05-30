package com.enmusushi.mapdata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Timer;

@SpringBootTest
class MapDataApplicationTests {

    @Test
    void contextLoads() {
        Timer timer = new Timer();
        TestTask testTask = new TestTask();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 30);
        timer.schedule(testTask, calendar.getTime(), 3600000);
    }

}
