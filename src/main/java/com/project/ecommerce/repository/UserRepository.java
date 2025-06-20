package com.project.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.ecommerce.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}