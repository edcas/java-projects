package com.company.examples.threads.wait;

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

    public synchronized int incrementDays() {

        try {
            wait(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.days += 1;

        notifyAll();

        return this.days;
    }
}
