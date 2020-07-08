package com.company.examples.composition.relationships.many_to_many;

import java.util.ArrayList;

public class House {

    private String address;

    private ArrayList<Person> people;

    public House(String address) {
        this.address = address;
        this.people = new ArrayList<Person>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean contains(Object o) {
        return people.contains(o);
    }

    public boolean add(Person person) {
        return people.add(person);
    }

    public int count() {
        return this.people.size();
    }
}
