package com.company.examples.lambda.streams;

public class Computer {

    private String brand;

    private int memory;

    private int disk;

    private double price;

    public Computer(String brand, double price, int disk, int memory) {
        this.brand = brand;
        this.memory = memory;
        this.disk = disk;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
