package com.company.interfaces.consumers.defaultMethods;

import com.company.interfaces.services.Person;
import com.company.interfaces.services.PersonService;

import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        PersonService service = new PersonService();
        List<Person> people =  service.all();
        Consumer<Person> consumerFirstName = Main::printlnFirstName;
        Consumer<Person> consumerLastName = Main::printlnLastName;

        System.out.println("**********consumerAccept*************");
        consumerLastName.accept(new Person("John", "Doe", 30));

        System.out.println("**********consumerAnThen*************");
        Consumer<Person> consumerJoin = consumerFirstName.andThen(consumerLastName);
        people.forEach(consumerJoin);
    }

    public static void printlnFirstName(Person person) {
        System.out.println(person.getFirstName());
    }

    public static void printlnLastName(Person person) {
        System.out.println(person.getLastName());
    }

}
