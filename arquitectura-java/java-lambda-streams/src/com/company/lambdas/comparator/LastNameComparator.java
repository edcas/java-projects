package com.company.lambdas.comparator;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person otherPerson) {
        return person.getLastName().compareTo(otherPerson.getLastName());
    }

}
