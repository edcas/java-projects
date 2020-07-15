package com.company.examples.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<String>();
        collection.add("Hello");
        collection.add("How");
        collection.add("are");
        collection.add("you?");

        System.out.println("Contains you?: " + collection.contains("you?"));

        Collection<String> collectionOther = new ArrayList<String>();
        collectionOther.add("bye");
        collectionOther.add("bye xD");
        collection.addAll(collectionOther);

        System.out.println("Size: " + collection.size());

        for (String item: collection) {
            System.out.println("Item:" + item);
        }

        System.out.println("isEmpty: " + collection.isEmpty());

        collection.clear();

        System.out.println("clear - size: " + collection.size());

        System.out.println("isEmpty: " + collection.isEmpty());

    }

}
