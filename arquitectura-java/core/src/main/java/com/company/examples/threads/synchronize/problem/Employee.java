package com.company.examples.threads.synchronize.problem;

public class Employee {

    private int days;

    public Employee(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int incrementDays() {
        this.days += 1;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this.days;
    }
}
