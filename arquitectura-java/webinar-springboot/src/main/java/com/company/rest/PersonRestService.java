package com.company.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonRestService {

    private static final List<Person> people = new ArrayList<>();

    static {
        people.add(new Person("John", "Doe", 20));
        people.add(new Person("Maggie", "Doe", 18));
    }

    @RequestMapping("/people")
    @ResponseBody
    public List<Person> all() {
        return people;
    }

}
