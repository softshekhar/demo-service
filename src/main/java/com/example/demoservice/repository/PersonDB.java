package com.example.demoservice.repository;

import com.example.demoservice.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonDB extends MongoRepository<Person, String> {

}
