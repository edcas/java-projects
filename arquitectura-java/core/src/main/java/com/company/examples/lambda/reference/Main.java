package com.company.examples.lambda.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Book enderGame = new Book("Science fiction", 400, 20, "Ender's Game");
        Book harryPotter = new Book("Fantasy", 600, 25, "Harry Potter and the Goblet of Fire");
        Book stone = new Book("Crime fiction", 300, 15, "The Stone Cutter");
        Book pillars = new Book("History", 1000, 30, "The Pillars of the Earth");

        List<Book> books = Arrays.asList(enderGame, harryPotter, stone, pillars);

        List<Book> booksFilter = new ArrayList<>();

        filter(books, booksFilter, BookFilter::byPages);

        System.out.println("Books filter by pages > 400:");
        for (Book book : booksFilter) {
            System.out.println("  - " + book.getTitle() + " -> " + book.getPages());
        }

        System.out.println("****************************************");
        booksFilter.clear();

        filter(books, booksFilter, BookFilter::byPrice);

        System.out.println("Books filter by price > 15:");
        for (Book book : booksFilter) {
            System.out.println("  - " + book.getTitle() + " -> " + book.getPrice());
        }
    }

    public static void filter(List<Book> books, List<Book> booksFilter, Predicate<Book> filter) {
        for (Book book : books) {
            if (filter.test(book)) {
                booksFilter.add(book);
            }
        }
    }

}
