package com.example.demoservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public class DB {
}

interface PersonDB extends MongoRepository<Person, String> {

}
