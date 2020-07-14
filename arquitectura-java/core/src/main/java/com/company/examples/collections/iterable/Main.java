package com.company.examples.collections.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("you?");

        Iterable<String> iterable = list;
        Iterator<String> iterator = iterable.iterator();

        while(iterator.hasNext()) {
            if (iterator.next().equals("Hello")) {
                iterator.remove();
            }
        }

        for(String value: list) {
            System.out.println(value);
        }

    }

}
