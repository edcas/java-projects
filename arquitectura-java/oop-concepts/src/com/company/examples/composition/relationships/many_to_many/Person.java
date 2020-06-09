package com.company.examples.composition.relationships.many_to_many;

import java.util.ArrayList;
import java.util.Objects;

public class Person {

    private String name;

    private ArrayList<House> houses;

    public Person(String name) {
        this.name = name;
        this.houses = new ArrayList<House>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public boolean contains(Object o) {
        return houses.contains(o);
    }

    public boolean add(House house) {
        return houses.add(house);
    }

}
