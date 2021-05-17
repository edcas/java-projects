package com.company.lambdas.method.defaults;

public interface PersonFilter {

    public boolean test(Person person);

    default public PersonFilter or(PersonFilter filter) {
        return (Person person) -> {
            return test(person) || filter.test(person);
        };
    }

}
