package com.company.examples.threads.state;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(0);
        Job job = new Job(employee, 5);
        Thread thread = new Thread(job);
        thread.start();

    }

}
