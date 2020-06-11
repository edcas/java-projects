package com.company.examples.generics.equality;

public class Main {

    public static void main(String[] args) {

        Cookie chocolate = new Cookie("Chocolate");
        Cookie vanilla = new Cookie("Vanilla");
        Cookie strawberry = new Cookie("Strawberry");
        Cookie otherChocolate = new Cookie("Chocolate");

        PackDuplex<Cookie> pack = new PackDuplex<Cookie>(chocolate, strawberry);
        System.out.println(pack.getItem().getFlavor());

        System.out.println(chocolate.equals(otherChocolate));

        System.out.println(pack.equals());

    }

}
