package com.company.examples.composition.relationships.one_to_one;

public class Main {

    public static void main(String[] args) {

        Package aPackage = new Package("blue", "Chocolate", 2.5);

        System.out.println(aPackage.getColor());
        System.out.println(aPackage.getFlavor());
        System.out.println(aPackage.getPrice());

        aPackage.setPrice(5.50);
        System.out.println(aPackage.getPrice());
    }

}
