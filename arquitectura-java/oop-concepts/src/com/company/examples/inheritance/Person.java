package com.company.examples.inheritance;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " runs at 5 kph");
    }
}
