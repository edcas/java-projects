package com.company.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonRestService {

    private static final List<Person> people = new ArrayList<>();

    static {
        people.add(new Person("John", "Doe", 20));
        people.add(new Person("Maggie", "Doe", 18));
    }

    @ResponseBody
    @RequestMapping("/people")
    public List<Person> all() {
        return people;
    }

    @ResponseBody
    @RequestMapping("/people/{firstName}")
    public Person find(@PathVariable String firstName) {
        return people.stream().filter(person -> person.getFirstName().equals(firstName)).findFirst().orElse(null);
    }

    @ResponseBody
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/people/{firstName}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String firstName) {
        people.removeIf(person -> person.getFirstName().equals(firstName));
    }

    @ResponseBody
    // @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public ResponseEntity<Person> create(@RequestBody Person person, UriComponentsBuilder builder) {
        people.add(person);

        HttpHeaders headers = new HttpHeaders();
        UriComponents location = builder.path("/people/{firstName}").buildAndExpand(person.getFirstName());
        headers.setLocation(location.toUri());

        return new ResponseEntity<>(person, headers, HttpStatus.CREATED);
    }

    @ResponseBody
    @RequestMapping(value = "/people/{firstName}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable String firstName, @RequestBody Person person) {
        int index = people.indexOf(new Person(firstName));

        if (index != -1) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        people.set(index, person);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
