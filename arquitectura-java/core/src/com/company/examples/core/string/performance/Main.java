package com.company.examples.core.string.performance;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String hello = "Hello";
        for (int i = 0; i < 50000; i++) {
            hello += "hello-" + i;
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);

    }

}
