package com.company.interfaces.biconsumer;

import com.company.interfaces.services.Person;
import com.company.interfaces.services.PersonService;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        PersonService service = new PersonService();
        List<Person> people = service.all();

        Map<String, Person> map = people.stream().collect(Collectors.toMap(Person::id, person -> person));

        BiConsumer<String, Person> biConsumer = (key, value) -> System.out.printf("Key %s, Value %s %n", key, value.getLastName());
        map.forEach(biConsumer);
    }

}
