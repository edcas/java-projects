package com.company.examples.threads.runnable;

public class Job implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Job " + Thread.currentThread().getName() + " -> " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
