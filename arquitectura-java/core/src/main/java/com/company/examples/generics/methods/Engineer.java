package com.company.examples.generics.methods;

public class Engineer extends Person {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running engineer");
    }
}
