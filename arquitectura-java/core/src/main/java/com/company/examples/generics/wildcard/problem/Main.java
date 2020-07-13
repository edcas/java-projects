package com.company.examples.generics.wildcard.problem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John");
        Engineer engineer = new Engineer("Maggie");

        run(person);
        run(engineer);
        System.out.println("====");

        List<Person> people = new ArrayList<Person>();
        people.add(person);
        people.add(engineer);

        runAll(people);

        // Problem
        List<Engineer> engineers = new ArrayList<Engineer>();
        engineers.add(engineer);
        // Not compile List<Person> != List<Engineer>
        // runAll(engineers);
    }

    public static void runAll(List<Person> persons) {
        for (Person person: persons) {
            person.run();
        }
    }

    // Polymorphism
    public static void run(Person person) {
        person.run();
    }

}
