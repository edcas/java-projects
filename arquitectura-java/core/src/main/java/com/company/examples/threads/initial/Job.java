package com.company.examples.threads.initial;

public class Job extends Thread {

    public Job(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Job " + this.getName() + " -> " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
