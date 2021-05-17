package com.company.streams.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

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

        OptionalInt sum = people.stream()
                .mapToInt(Person::getAge)
                .reduce(Integer::sum);

        System.out.println(sum.getAsInt());
    }

}
