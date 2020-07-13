package com.company.examples.core.string.stringbuffer;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        StringBuffer hello = new StringBuffer();
        hello.append("Hello");
        for (int i = 0; i < 50000; i++) {
            hello.append("hello-" + i);
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);

    }

}
