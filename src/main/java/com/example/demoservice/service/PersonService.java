package com.example.demoservice.service;

import com.example.demoservice.domain.Person;

import java.util.List;

public interface PersonService {
	String hello();

	Person addPerson(Person person);

	List<Person> getPeople();

	void deletePerson(Person person);

	Person updatePerson(Person person);
}
