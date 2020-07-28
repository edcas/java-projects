package com.company.examples.threads.state;

public class Job implements Runnable {

    private Employee employee;

    private int days;

    public Job(Employee employee, int days) {
        this.employee = employee;
        this.days = days;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public void run() {

        for (int i = 0; i < days; i++) {
            System.out.println(employee.incrementDays());
        }

    }
}
