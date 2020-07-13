package com.company.examples.generics.inheritance;

public class Main {

    public static void main(String[] args) {

        Cookie chocolate = new Cookie("Chocolate", 0.2);
        Cookie vanilla = new Cookie("Vanilla", 0.1);

        BoxProduct<Cookie> boxProduct = new BoxProduct<Cookie>(2);
        boxProduct.add(chocolate);
        boxProduct.add(vanilla);

        for (Cookie cookie : boxProduct) {
            System.out.println(cookie.getFlavor());
            System.out.println(cookie.getPrice());
        }

        System.out.println("Total: " + boxProduct.getPrice());

        Box<Book> box = new Box<Book>(2);
        box.add(new Book());
    }

}
