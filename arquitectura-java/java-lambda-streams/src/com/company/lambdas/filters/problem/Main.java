package com.company.lambdas.filters.problem;

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
                add(new Person("Stephanie", "Doe", 15));
                add(new Person("Sean", "Doe", 33));
            }
        };

        System.out.println("****** Filter By FirstName *******");
        List<Person> peopleByFirstName = filterByFirstName("John", people);
        peopleByFirstName.forEach(System.out::println);

        System.out.println("****** Filter By LastName *******");
        List<Person> peopleByLastName = filterByLastName("Doe", people);
        peopleByLastName.forEach(System.out::println);
    }

    public static List<Person> filterByFirstName(String firstName, List<Person> people) {
        List<Person> peopleFilter = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().equals(firstName)) {
                peopleFilter.add(person);
            }
        }

        return peopleFilter;
    }

    public static List<Person> filterByLastName(String lastName, List<Person> people) {
        List<Person> peopleFilter = new ArrayList<>();

        for (Person person : people) {
            if (person.getLastName().equals(lastName)) {
                peopleFilter.add(person);
            }
        }

        return peopleFilter;
    }

}
