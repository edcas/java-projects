package com.company.examples.composition.relationships.many_to_many;

public class Main {

    public static void main(String[] args) {

        House house = new House("Santander, Spain");
        Person person = new Person("John");
        Person otherPerson = new Person("Maggie");

        house.add(person);
        house.add(otherPerson);

        System.out.println(house.contains(new Person("John")));
        System.out.println(house.count());

        person.add(house);
        System.out.println(person.contains(house));

    }

}
