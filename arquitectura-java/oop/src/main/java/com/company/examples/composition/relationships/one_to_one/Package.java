package com.company.examples.composition.relationships.one_to_one;

public class Package {

    private String color;

    private final Cookie cookie;

    public Package(String color, String flavor, double price) {
        this.color = color;
        this.cookie = new Cookie(flavor, price);
    }

    public String getFlavor() {
        return cookie.getFlavor();
    }

    public void setFlavor(String flavor) {
        cookie.setFlavor(flavor);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return cookie.getPrice();
    }

    public void setPrice(double price) {
        cookie.setPrice(price);
    }
}
