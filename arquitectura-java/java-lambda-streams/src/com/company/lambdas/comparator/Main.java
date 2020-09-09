package com.company.lambdas.comparator;

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

        System.out.println("******* FirstName  ******");
        people.sort(new FirstNameComparator());
        people.forEach(System.out::println);

        System.out.println("****** LastName *******");
        people.sort(new LastNameComparator());
        people.forEach(System.out::println);

        System.out.println("****** Age *******");
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person person, Person otherPerson) {
                return Integer.compare(person.getAge(), otherPerson.getAge());
            }
        });
        people.forEach(System.out::println);
    }
}
