package com.company.examples.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("How");
        set.add("are");
        set.add("you?");

        for (String item : set) {
            System.out.println(item);
        }

        System.out.println("**********************");

        Set<Person> people = new TreeSet<>();
        people.add(new Person("Christine", "Xin", "Bogota"));
        people.add(new Person("Mary", "Simpson", "Caracas"));
        people.add(new Person("John", "Doe", "Medellin"));

        for (Person person : people) {
            System.out.println(person.getLastName());
        }

    }

}
