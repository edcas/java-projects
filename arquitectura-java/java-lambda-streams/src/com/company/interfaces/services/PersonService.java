package com.company.interfaces.services;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public List<Person> all() {
        return new ArrayList<Person>() {
            {
                add(new Person("John", "Doe", 30));
                add(new Person("Sophie", "Ferguson", 40));
                add(new Person("Maggie", "Andrews", 20));
                add(new Person("John", "Wagner", 50));
                add(new Person("Maggie", "Wagner", 50));
                add(new Person("Stephanie", "Doe", 15));
                add(new Person("Sean", "Doe", 33));
            }
        };
    }

}
