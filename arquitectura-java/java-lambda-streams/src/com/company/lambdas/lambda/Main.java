package com.company.lambdas.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>() {
            {
                add(new Person("John", "Doe", 30));
                add(new Person("Sophie", "Ferguson", 40));
                add(new Person("Maggie", "Andrews", 20));
            }
        };

        System.out.println("****** Age *******");
        people.sort((person, otherPerson) -> Integer.compare(person.getAge(), otherPerson.getAge()));
        people.forEach(System.out::println);

        System.out.println("****** Simplification Age *******");
        people.sort(Comparator.comparingInt(Person::getAge));
        people.forEach(System.out::println);
    }
}
