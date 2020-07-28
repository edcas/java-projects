package com.company.examples.threads.join;

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

        // 18 seg
        System.out.println("Finish -> " + (end - begin) / 1000 + " seg");

        /*
        *
        public synchronized int incrementDays() {
            this.days += 1;

            try {
                Thread.sleep(2000); -> Source of the problem for concurrent systems.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return this.days;
        }
        *
        * */
    }

}
