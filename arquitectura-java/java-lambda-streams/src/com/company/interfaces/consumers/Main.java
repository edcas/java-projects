package com.company.interfaces.consumers;

import com.company.interfaces.services.Person;
import com.company.interfaces.services.PersonService;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        PersonService service = new PersonService();
        List<Person> people = service.all();
        System.out.println("***********consumerFirstName************");
        Consumer<Person> consumerFirstName = person -> System.out.println(person.getFirstName());
        people.forEach(consumerFirstName);
        System.out.println("**********consumerLastName*************");
        Consumer<Person> consumerLastName = Main::printlnLastName;
        people.forEach(consumerLastName);
    }

    public static void printlnLastName(Person person) {
        System.out.println(person.getLastName());
    }

}
