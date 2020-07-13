package com.company.examples.generics.inheritance;

import java.util.Iterator;

public class BoxProduct<T extends Product> extends Box<T> {

    public BoxProduct(int maximum) {
        super(maximum);
    }

    public double getPrice() {
        double total = 0;

        for (T elem : this) {
            total += elem.getPrice();
        }

        return total;
    }
}
