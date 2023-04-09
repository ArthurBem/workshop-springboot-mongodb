package com.educandoweb.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    
}
