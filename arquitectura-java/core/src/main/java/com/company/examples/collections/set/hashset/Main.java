package com.company.examples.collections.set.hashset;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("How");
        set.add("are");
        set.add("you");
        set.add("Hello");

        for (String item : set) {
            System.out.println(item);
        }

        System.out.println("*********** Order ***********");

        HashSet<Person> personSet = new HashSet<>();
        Person john = new Person("John");
        Person mary = new Person("Mary");
        Person maryOther = new Person("Mary");
        Person callie = new Person("Callie");

        personSet.add(mary);
        personSet.add(john);
        personSet.add(maryOther);
        personSet.add(callie);

        for (Person person : personSet) {
            System.out.println(person.getName());
        }

    }

}
