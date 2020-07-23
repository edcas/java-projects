package com.company.examples.lambda.reference;

public class BookFilter {

    private final static int MAX_PRICE = 15;

    private final static int MAX_PAGES = 400;

    public static boolean byPrice(Book book) {
        return book.getPrice() > MAX_PRICE;
    }

    public static boolean byPages(Book book) {
        return book.getPages() > MAX_PAGES;
    }

}
