package com.company.examples.abstracts;

public class Truck extends Vehicle {

    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void accelerate() {
        System.out.println("Speeding up Truck");
    }

}
