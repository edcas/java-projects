package com.company.examples.generics.interfaces;

public class Main {

    public static void main(String[] args) {

        Cookie chocolate = new Cookie("Chocolate", 0.2);
        Cookie vanilla = new Cookie("Vanilla", 0.1);

        Box<Cookie> box = new Box<Cookie>(2);
        box.add(chocolate);
        box.add(vanilla);

        System.out.println(box.getPrice());

    }

}
