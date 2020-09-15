package com.company.lambdas.predicate;

import java.util.function.Predicate;

public class FirstNameFilter implements Predicate<Person> {

    private final String firstName;

    public FirstNameFilter(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean test(Person person) {
        return this.firstName.equals(person.getFirstName());
    }

}
