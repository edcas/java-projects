package com.company.examples.generics.methods;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Running person");
    }

    @Override
    public String toString() {
        return name;
    }
}
