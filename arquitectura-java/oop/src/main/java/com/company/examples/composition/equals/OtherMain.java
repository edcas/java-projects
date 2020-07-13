package com.company.examples.composition.equals;

public class OtherMain {

    public static void main(String[] args) {
        // The business rule is that two people are the same if they have the same name
        Person person = new Person("John");
        Person samePerson = new Person("John");

        // fast way
        System.out.println(person.hashCode());
        System.out.println(samePerson.hashCode());

        // direct way
        System.out.println(person.equals(samePerson));
    }

}
