package com.company.examples.abstracts;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void accelerate() {
        System.out.println("Speeding up Car");
    }

}
