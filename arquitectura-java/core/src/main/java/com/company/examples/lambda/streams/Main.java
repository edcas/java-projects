package com.company.examples.lambda.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int MAX_PRICE = 1000;
    public static final double TAX = 1.21;

    public static void main(String[] args) {

        Computer lenovo = new Computer("Lenovo", 700, 256, 8);
        Computer apple = new Computer("Apple", 1300, 256, 8);
        Computer dell = new Computer("Dell", 1000, 256, 16);
        Computer hp = new Computer("HP", 800, 256, 8);

        List<Computer> computers = new ArrayList<>();

        computers.add(lenovo);
        computers.add(apple);
        computers.add(dell);
        computers.add(hp);

        System.out.println("Computers priced at 1000 or more: ");
        computers.stream()
                .filter(computer -> computer.getPrice() >= MAX_PRICE)
                .map(computer -> computer.getPrice() * TAX)
                .forEach(System.out::println);

        System.out.println("Total price of computers with a price greater than or equal to 1000: ");
        computers.stream()
                .filter(computer -> computer.getPrice() >= MAX_PRICE)
                .map(computer -> computer.getPrice() * TAX)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        System.out.println("Filter peek: ");
        computers.stream()
                .peek(computer -> System.out.println(computer.getBrand() + " - " +computer.getPrice()))
                .filter(computer -> computer.getPrice() >= MAX_PRICE)
                .peek(computer -> System.out.println(computer.getBrand() + " - " +computer.getPrice()))
                .map(computer -> computer.getPrice() * TAX)
                .reduce(Double::sum)
                .ifPresent(System.out::println);
    }

}
