package com.company.examples.generics.methods;

public class Athlete extends Person {

    public Athlete(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running athlete");
    }
}
