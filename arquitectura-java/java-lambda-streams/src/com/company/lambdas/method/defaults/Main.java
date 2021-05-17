package com.company.lambdas.method.defaults;

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

        System.out.println("****** Filter By Age *******");
        PersonFilter filterByFirstName = new FirstNameFilter("John");
        PersonFilter filterByFirstNameOrRetired = filterByFirstName.or(Person::isRetired);
        List<Person> peopleByAge = filterPerson(filterByFirstNameOrRetired, people);
        peopleByAge.forEach(System.out::println);
    }

    public static List<Person> filterPerson(PersonFilter filter, List<Person> people) {
        List<Person> peopleFilter = new ArrayList<>();

        for (Person person : people) {
            if (filter.test(person)) {
                peopleFilter.add(person);
            }
        }

        return peopleFilter;
    }

}
