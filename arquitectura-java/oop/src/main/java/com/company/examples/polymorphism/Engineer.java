package com.company.examples.polymorphism;

public class Engineer extends Person {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " runs at 4 kph");
    }
}
