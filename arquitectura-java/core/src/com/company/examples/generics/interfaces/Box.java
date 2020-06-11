package com.company.examples.generics.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Product> {

    private final List<T> content;

    private final int maximum;

    public Box(int maximum) {
        this.maximum = maximum;
        this.content = new ArrayList<T>();
    }

    public List<T> getContent() {
        return content;
    }

    public int getMaximum() {
        return maximum;
    }

    public void add(T elem) {
        if (this.content.size() < this.maximum) {
            this.content.add(elem);
        }
    }

    public void remove(T elem) {
        this.content.remove(elem);
    }

    public double getPrice() {
        double total = 0;

        for (T elem : this.content) {
            total += elem.getPrice();
        }

        return total;
    }
}
