package com.mattwelke;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

public class App {

    public static void main(String[] args) {
        Thread.ofVirtual().start(() -> System.out.println("Hello world from a virtual thread."));
    }
}
