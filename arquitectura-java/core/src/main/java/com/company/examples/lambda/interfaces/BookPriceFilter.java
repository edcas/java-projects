package com.company.examples.lambda.interfaces;

public class BookPriceFilter implements BookFilter {

    public static final int MAX_PRICE = 15;

    @Override
    public boolean test(Book book) {
        return book.getPrice() > MAX_PRICE;
    }

}
