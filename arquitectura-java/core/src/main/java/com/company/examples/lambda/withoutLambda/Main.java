package com.company.examples.lambda.withoutLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book enderGame = new Book("Science fiction", 400, 20, "Ender's Game");
        Book harryPotter = new Book("Fantasy", 400, 25, "Harry Potter and the Goblet of Fire");
        Book stone = new Book("Crime fiction", 400, 15, "The Stone Cutter");
        Book pillars = new Book("History", 400, 30, "The Pillars of the Earth");

        List<Book> books = Arrays.asList(enderGame, harryPotter, stone, pillars);

        List<Book> booksFilter = new ArrayList<>();

        for (Book book : books) {
            if(book.getPrice() > 15) {
                booksFilter.add(book);
            }
        }

        System.out.println("Books filter:");
        for (Book book: booksFilter) {
            System.out.println("  - " + book.getTitle());
        }

    }

}
