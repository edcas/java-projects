package com.company.examples.collections.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("firstName", "John");
        dictionary.put("lastName", "Doe");
        dictionary.put("city", "Medellin");

        System.out.println(dictionary.get("firstName"));

        Map<String, Person> people = new HashMap<>();
        Person john = new Person("John", "Doe", "Medellin");
        Person mary = new Person("Mary", "Doe", "Caracas");
        people.put("john", john);
        people.put("mary", mary);
        people.put("johnOther", john);

        Person getMary = people.get("mary");
        System.out.println("isMary: " + getMary.getFirstName());
        ;

        for (Person person : people.values()) {
            System.out.println(person.getFirstName());
        }

        Iterator<Map.Entry<String, Person>> iterator = people.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Person> item = iterator.next();
            System.out.println(item.getKey() + " : " + item.getValue().getFirstName());
        }

        for (Map.Entry<String, Person> item : people.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue().getFirstName());
        }

    }

}
