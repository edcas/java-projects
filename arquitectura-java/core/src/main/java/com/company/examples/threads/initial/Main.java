package com.company.examples.threads.initial;

public class Main {

    public static void main(String[] args) {

        Job jobA = new Job("A");
        Job jobB = new Job("B");

        jobA.start();
        jobB.start();

    }

}
