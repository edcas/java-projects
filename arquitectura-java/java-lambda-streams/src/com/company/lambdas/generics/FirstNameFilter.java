package com.company.lambdas.generics;

public class FirstNameFilter implements Filter<Person> {

    private final String firstName;

    public FirstNameFilter(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean test(Person person) {
        return this.firstName.equals(person.getFirstName());
    }

}
