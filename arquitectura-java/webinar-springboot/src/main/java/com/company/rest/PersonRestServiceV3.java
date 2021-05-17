package com.company.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/people/v3")
public class PersonRestServiceV3 {

    private static final List<Person> people = new ArrayList<>();

    static {
        people.add(new Person("John", "Doe", 20));
        people.add(new Person("Maggie", "Doe", 18));
    }

    @GetMapping
    public List<PersonDTO> all() {
        return people.stream().map(PersonDTO::new).collect(Collectors.toList());
    }

    @GetMapping("/{firstName}")
    public PersonDTO find(@PathVariable String firstName) {
        return people.stream().filter(person -> person.getFirstName().equals(firstName)).findFirst().map(PersonDTO::new).orElse(null);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(value = "/{firstName}")
    public void delete(@PathVariable String firstName) {
        people.removeIf(person -> person.getFirstName().equals(firstName));
    }

    @PostMapping(value = "/")
    public ResponseEntity<PersonDTO> create(@RequestBody PersonDTO personDTO, UriComponentsBuilder builder) {
        Person person = new Person(personDTO.getName(), personDTO.getLastName(), personDTO.getAge());
        people.add(person);

        HttpHeaders headers = new HttpHeaders();
        UriComponents location = builder.path("/people/{firstName}").buildAndExpand(person.getFirstName());
        headers.setLocation(location.toUri());

        return new ResponseEntity<>(personDTO, headers, HttpStatus.CREATED);
    }

    @PutMapping(value = "/{firstName}")
    public ResponseEntity<Void> update(@PathVariable String firstName, @RequestBody PersonDTO personDTO) {
        int index = people.indexOf(new Person(firstName));

        if (index != -1) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        Person person = new Person(personDTO.getName(), personDTO.getLastName(), personDTO.getAge());
        people.set(index, person);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
