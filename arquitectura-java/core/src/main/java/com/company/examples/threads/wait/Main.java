package com.company.examples.threads.wait;

public class Main {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        Employee employee = new Employee(0);
        Job job = new Job(employee, 5);
        Thread thread = new Thread(job);
        thread.start();

        Job jobOther = new Job(employee, 4);
        Thread threadOther = new Thread(jobOther);
        threadOther.start();

        try {
            thread.join();
            threadOther.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        // ~6 seg
        System.out.println("Finish -> " + (end - begin) / 1000 + " seg");
    }

}
