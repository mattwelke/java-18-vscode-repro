package com.mattwelke;

public class App {

    public static void main(String[] args) {
        Thread.ofVirtual().start(() -> System.out.println("Hello world from a virtual thread."));
    }
}
