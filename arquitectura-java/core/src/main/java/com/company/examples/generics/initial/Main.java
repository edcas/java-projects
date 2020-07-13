package com.company.examples.generics.initial;

public class Main {

    public static void main(String[] args) {

        Cookie chocolate = new Cookie("Chocolate");
        Cookie vanilla = new Cookie("Vanilla");
        Cookie strawberry = new Cookie("Strawberry");

        Box<Cookie> box = new Box<Cookie>(2);
        box.add(chocolate);
        box.add(vanilla);
        box.add(strawberry);

        for (Cookie cookie : box.getContent()) {
            System.out.println(cookie.getFlavor());
        }

        Box<Bonbon> boxBonbon = new Box<Bonbon>(5);
        boxBonbon.add(new Bonbon("Normal"));

        // The generic type has been declared as a bonbon and cookies are not allowed
        // boxBonbon.add(new Cookie("Chocolate"));

    }

}
