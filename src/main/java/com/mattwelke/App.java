package com.mattwelke;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class App {

    public static void main(String[] args) {
        Instant start = Instant.now();

        AtomicInteger num = new AtomicInteger();

        for (int i = 0; i < 100000; i++) {
            Runnable r = num::getAndIncrement;
            Thread.ofVirtual().start(() -> System.out.println("Hello world from a virtual thread."));
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Time: " + Duration.between(Instant.now(), start));
    }
}
