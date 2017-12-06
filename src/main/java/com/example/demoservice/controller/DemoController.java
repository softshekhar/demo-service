package com.example.demoservice.controller;

import com.example.demoservice.domain.Person;
import com.example.demoservice.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController public class DemoController {

	private PersonService personService;

	// from Spring 4.3 onwards we do not need autowire for single constructor based injection.
	// Refer : https://spring.io/blog/2016/03/04/core-container-refinements-in-spring-framework-4-3
	public DemoController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("hello") @CrossOrigin public String hello() {
		return personService.hello();
	}

	@PostMapping("addperson") @CrossOrigin public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}

	@GetMapping("people") @CrossOrigin List<Person> getPeople() {
		return personService.getPeople();
	}
}
