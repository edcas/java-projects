package com.company.examples.generics.methods;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John");
        Engineer engineer = new Engineer("Maggie");

        List<Person> people = new ArrayList<Person>();
        people.add(person);
        people.add(engineer);

        List<Person> clonePeople = clone(people);
        clonePeople.forEach(System.out::println);

    }

    public static <T> List<T> clone(List<T> list) {
        return new ArrayList<T>(list);
    }

}
