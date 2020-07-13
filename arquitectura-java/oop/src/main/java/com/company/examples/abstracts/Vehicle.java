package com.company.examples.abstracts;

public abstract class Vehicle {

    private String brand;

    public abstract void accelerate();

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void payTaxes() {
        System.out.println("Paying taxes");
    }
}
