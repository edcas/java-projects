package com.company.rest;

import java.util.Objects;

public class PersonDTO {

    private String name;

    private String lastName;

    private int age;

    public PersonDTO() {
    }

    public PersonDTO(String name) {
        this.name = name;
    }

    public PersonDTO(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public PersonDTO(Person person) {
        this.setName(person.getFirstName());
        this.setLastName(person.getLastName());
        this.setAge(person.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return age == personDTO.age &&
                Objects.equals(name, personDTO.name) &&
                Objects.equals(lastName, personDTO.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }

}
