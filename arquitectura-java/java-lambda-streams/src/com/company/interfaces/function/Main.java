package com.company.interfaces.function;

import com.company.interfaces.services.Person;
import com.company.interfaces.services.PersonService;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        PersonService service = new PersonService();
        List<Person> people = service.all();

        Function<Person, String> firstName = Person::getFirstName;

        people.stream().map(firstName).forEach(System.out::println);
    }

}
