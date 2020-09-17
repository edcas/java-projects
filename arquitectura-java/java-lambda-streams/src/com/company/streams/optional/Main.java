package com.company.streams.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<Person> optionalPerson = Optional.of(new Person("John", "Doe", 30));
        optionalPerson.ifPresent(person -> System.out.println(person.toString()));

        System.out.println("*****************************");

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

        Optional<Person> retired = people.stream().filter(Person::isRetired).findFirst();

        retired.ifPresent(person -> System.out.println(person.toString()));
    }

}
