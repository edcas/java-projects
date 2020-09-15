package com.company.lambdas.statics;

import java.util.function.Predicate;

public interface PersonFilter extends Predicate<Person> {

    @SafeVarargs
    static Predicate<Person> orMultiple(Predicate<Person>... predicates) {
        Predicate<Person> multiple = predicates[0];

        for (Predicate<Person> predicate : predicates) {
            multiple = multiple.or(predicate);
        }

        return multiple;
    }
}
