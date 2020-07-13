package com.company.examples.abstracts;

public class Main {

    public static void main(String[] args) {
        Vehicle motorcycle = new Motorcycle("Ducati");
        Car car = new Car("Toyota");
        Truck truck = new Truck("Volvo");

        System.out.println(truck.getBrand());
        truck.payTaxes();
        accelerate(truck);

        System.out.println(car.getBrand());
        car.payTaxes();
        accelerate(car);

        System.out.println(motorcycle.getBrand());
        motorcycle.payTaxes();
        accelerate(motorcycle);

    }

    public static void accelerate(Vehicle vehicle) {
        vehicle.accelerate();
    }

}
