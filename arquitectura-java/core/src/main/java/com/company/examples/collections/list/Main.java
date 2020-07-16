package com.company.examples.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("you?");

        System.out.println("Get(0): " + list.get(0));
        System.out.println("Get(1): " + list.get(1));

        System.out.println("Index How: " + list.indexOf("How"));

        list.set(0, "Bye");

        System.out.println("Get(0): " + list.get(0));

    }

}
