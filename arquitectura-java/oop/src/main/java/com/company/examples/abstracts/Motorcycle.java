package com.company.examples.abstracts;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void accelerate() {
        System.out.println("Speeding up Motorcycle");
    }

}
