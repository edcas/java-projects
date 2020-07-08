package com.company.examples.composition.relationships.recursive;

import java.util.ArrayList;
import java.util.Objects;

public class Person {

    private String name;

    private ArrayList<Person> friends;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Person> getFriends() {
        return friends;
    }

    public void addFriend(Person person) {
        this.friends.add(person);
    }

    public void removeFriend(Person person) {
        this.friends.remove(person);
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
}
