package com.company.examples.lambda.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book enderGame = new Book("Science fiction", 400, 20, "Ender's Game");
        Book harryPotter = new Book("Fantasy", 600, 25, "Harry Potter and the Goblet of Fire");
        Book stone = new Book("Crime fiction", 300, 15, "The Stone Cutter");
        Book pillars = new Book("History", 1000, 30, "The Pillars of the Earth");

        List<Book> books = Arrays.asList(enderGame, harryPotter, stone, pillars);

        List<Book> booksFilter = new ArrayList<>();

        // filter(books, booksFilter, new BookPriceFilter());
        filter(books, booksFilter, new BookPageFilter());

        System.out.println("Books filter:");
        for (Book book : booksFilter) {
            System.out.println("  - " + book.getTitle());
        }

    }

    public static void filter(List<Book> books, List<Book> booksFilter, BookFilter filter) {
        for (Book book : books) {
            if (filter.test(book)) {
                booksFilter.add(book);
            }
        }
    }

}
