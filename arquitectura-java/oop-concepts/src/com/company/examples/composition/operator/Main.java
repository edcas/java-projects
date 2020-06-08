package com.company.examples.composition.operator;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("John");
        Person samePerson = person;

        // TRUE
        System.out.println(person == samePerson);
        System.out.println(person);
        System.out.println(samePerson);

        System.out.println("=====");

        Person otherPerson = new Person("John");
        // FALSE
        System.out.println(person == otherPerson);
        System.out.println(person);
        System.out.println(otherPerson);
    }

}
