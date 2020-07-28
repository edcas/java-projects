package com.company.examples.threads.runnable;

public class Main {

    public static void main(String[] args) {

        Job jobA = new Job();
        Job jobB = new Job();
        Job jobC = new Job();

        Thread threadA = new Thread(jobA, "A");
        Thread threadB = new Thread(jobC, "B");
        Thread threadC = new Thread(jobC, "C");

        threadA.start();
        threadB.start();
        threadC.start();

    }

}
