package com.company.examples.composition.relationships.one_to_many;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();
        box.addCookie(new Cookie("Chocolate", 2.0));
        box.addCookie(new Cookie("Chocolate", 2.0));
        box.addCookie(new Cookie("Chocolate", 2.0));
        box.addCookie(new Cookie("Chocolate", 2.0));
        box.addCookie("Chocolate", 2.0);

        System.out.println(box.count());
        System.out.println(box.price());

    }

}
