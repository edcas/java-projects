package com.company.interfaces.supplier;

import com.company.interfaces.services.Person;

public class SigningService {

    private final Person person;

    public SigningService(Person person) {
        this.person = person;
    }

    public String getSigning() {
        return String.format("Signature of the person %s", this.person.getLastName());
    }
}
