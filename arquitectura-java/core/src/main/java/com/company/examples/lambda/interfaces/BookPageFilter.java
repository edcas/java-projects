package com.company.examples.lambda.interfaces;

public class BookPageFilter implements BookFilter {

    public static final int MAX_PAGES = 400;

    @Override
    public boolean test(Book book) {
        return book.getPages() > MAX_PAGES;
    }

}
