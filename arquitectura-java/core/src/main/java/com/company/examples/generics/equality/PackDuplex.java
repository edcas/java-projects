package com.company.examples.generics.equality;

public class PackDuplex<T> {

    private T item;

    private T otherItem;

    public PackDuplex(T item, T otherItem) {
        this.item = item;
        this.otherItem = otherItem;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getOtherItem() {
        return otherItem;
    }

    public void setOtherItem(T otherItem) {
        this.otherItem = otherItem;
    }

    public boolean equals() {
        return item.equals(otherItem);
    }

}
