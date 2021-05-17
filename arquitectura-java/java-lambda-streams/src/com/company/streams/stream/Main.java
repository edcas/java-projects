package com.company.streams.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>() {
            {
                add(new Person("John", "Doe", 30));
                add(new Person("Sophie", "Ferguson", 40));
                add(new Person("Maggie", "Andrews", 20));
                add(new Person("John", "Wagner", 50));
                add(new Person("Maggie", "Wagner", 50));
                add(new Person("Stephanie", "Doe", 15));
                add(new Person("Sean", "Doe", 33));
            }
        };

        people.stream()
                .peek(System.out::println)
                .filter(Person::isRetired)
                .peek(System.out::println)
                .forEach(person -> System.out.println(person.toString()));

    }

    public static void println(Person person) {
        System.out.println("***************");
        System.out.println(person.toString());
        System.out.println("***************");
    }

}
