package com.enmusushi.messagingredis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Admin
 */
public class Receiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);
    private AtomicInteger count = new AtomicInteger();

    public void receiveMessage(String message) {
        LOGGER.info("Receive <" + message + ">");
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

}
