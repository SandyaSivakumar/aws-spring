package com.sandya.aws.repository;

import com.sandya.aws.model.Developer;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Developer, Integer>{

}
