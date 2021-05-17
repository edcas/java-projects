package com.company.lambdas.comparator;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person otherPerson) {
        return person.getFirstName().compareTo(otherPerson.getFirstName());
    }

}
