package com.company.examples.lambda.reference;

public class Book {

    private String category;

    private int pages;

    private double price;

    private String title;

    public Book(String category, int pages, double price, String title) {
        this.category = category;
        this.pages = pages;
        this.price = price;
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
