package com.company.lambdas.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>() {
            {
                add(new Person("John", "Doe", 30));
                add(new Person("Marc", "Doe", 40));
                add(new Person("Maggie", "Doe", 20));
            }
        };

        Collections.sort(people);

        people.forEach(System.out::println);
    }
}
