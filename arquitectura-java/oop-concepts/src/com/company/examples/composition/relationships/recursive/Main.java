package com.company.examples.composition.relationships.recursive;

public class Main {

    public static void main(String[] args) {

        Person john = new Person("John");
        Person maggie = new Person("Maggie");
        Person peter = new Person("Peter");

        john.addFriend(maggie);
        john.addFriend(peter);

        for (Person friend: john.getFriends()) {
            System.out.println(friend.getName());
        }

    }

}
