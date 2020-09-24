package com.company.interfaces.supplier;

import com.company.interfaces.services.Person;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Person> personSupplier = () -> new Person("John", "Doe", 30);
        Person person = personSupplier.get();
        System.out.println(person.getLastName());

        System.out.println("*******************************");

        SigningService service = new SigningService(new Person("Maggie", "Doe", 25));
        System.out.println("Printing page one");
        System.out.println(service.getSigning());
        System.out.println("Printing page two");
        System.out.println(service.getSigning());
        System.out.println("Printing page third");
        System.out.println(service.getSigning());

        System.out.println("***************Supplier****************");

        Supplier<String> signing = service::getSigning;

        System.out.println("Printing page one");
        System.out.println(signing.get());
        System.out.println("Printing page two");
        System.out.println(signing.get());
        System.out.println("Printing page third");
        System.out.println(signing.get());

    }

}
