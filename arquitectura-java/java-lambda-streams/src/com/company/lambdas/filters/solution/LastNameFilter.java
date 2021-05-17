package com.company.lambdas.filters.solution;

public class LastNameFilter implements PersonFilter {

    private final String lastName;

    public LastNameFilter(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean test(Person person) {
        return this.lastName.equals(person.getLastName());
    }

}
