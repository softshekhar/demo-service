package com.example.demoservice.service;

import com.example.demoservice.domain.Person;
import com.example.demoservice.repository.PersonDB;
import org.springframework.stereotype.Service;

import java.util.List;

@Service public class PersonServiceImpl implements PersonService {

	private PersonDB personDB;

	public PersonServiceImpl(PersonDB personDB) {
		this.personDB = personDB;
	}

	@Override public String hello() {
		return "Hello from Java Faggruppe service!";
	}

	@Override public Person addPerson(Person person) {
		return personDB.save(person);
	}

	@Override public List<Person> getPeople() {
		return personDB.findAll();
	}

	@Override public Person updatePerson(Person person) {
		return personDB.save(person);
	}

	@Override public void deletePerson(Person person) {
		personDB.delete(person);
	}
}
