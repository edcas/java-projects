package com.company.lambdas.filters.solution;

public class FirstNameFilter implements PersonFilter {

    private final String firstName;

    public FirstNameFilter(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean test(Person person) {
        return this.firstName.equals(person.getFirstName());
    }

}
