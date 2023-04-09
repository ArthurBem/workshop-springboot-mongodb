package com.educandoweb.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
