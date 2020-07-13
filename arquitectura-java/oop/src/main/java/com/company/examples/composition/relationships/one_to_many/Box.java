package com.company.examples.composition.relationships.one_to_many;

import java.util.ArrayList;

public class Box {

    private ArrayList<Cookie> cookies;

    public Box() {
        this.cookies = new ArrayList<Cookie>();
    }

    public ArrayList<Cookie> getCookies() {
        return cookies;
    }

    public void setCookies(ArrayList<Cookie> cookies) {
        this.cookies = cookies;
    }

    public void addCookie(Cookie cookie) {
        this.cookies.add(cookie);
    }

    public void addCookie(String flavor, double price) {
        this.cookies.add(new Cookie(flavor, price));
    }

    public int count() {
        return this.cookies.size();
    }

    public double price() {
        double total = 0;
        double priceBox = 1.0;

        for (Cookie cookie : cookies) {
            total =+ cookie.getPrice();
        }

        return total + priceBox;
    }
}
