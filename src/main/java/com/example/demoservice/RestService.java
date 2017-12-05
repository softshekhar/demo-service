package com.example.demoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestService {
    @Autowired PersonDB personDB;

    @GetMapping("hello")
    @CrossOrigin
    public String hello() {
        return "Hello from Java Faggruppe service!";
    }

    @GetMapping("addperson")
    @CrossOrigin
    public Person addPerson(@RequestParam String name) {
        Person person = new Person();
        person.setName(name);
        return personDB.save(person);
    }
    @PostMapping("addperson2")
    @CrossOrigin
    public Person addPerson2(@RequestBody Person person) {
        return personDB.save(person);
    }

    @GetMapping("people")
    @CrossOrigin
    List<Person> getPeople() {
        return personDB.findAll();
    }
}
