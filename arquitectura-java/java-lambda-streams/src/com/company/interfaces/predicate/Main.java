package com.company.interfaces.predicate;

import com.company.interfaces.services.PersonService;
import com.company.interfaces.services.Person;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        PersonService service = new PersonService();
        List<Person> people = service.all();

        Predicate<Person> lastNameDoe = person -> person.getLastName().equals("Doe");
        Predicate<Person> lastNameDoeAndGreaterThan30 = lastNameDoe.and(person -> person.getAge() > 30);

        people.stream().filter(lastNameDoeAndGreaterThan30).forEach(person -> System.out.println(person.toString()));
    }

}
