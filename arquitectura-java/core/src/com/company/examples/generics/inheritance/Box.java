package com.company.examples.generics.inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T> implements Iterable<T> {

    private final List<T> content;

    private final int maximum;

    public Box(int maximum) {
        this.maximum = maximum;
        this.content = new ArrayList<T>();
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

    @Override
    public Iterator<T> iterator() {
        return this.content.iterator();
    }
}
