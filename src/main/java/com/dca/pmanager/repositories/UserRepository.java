package com.dca.pmanager.repositories;

import com.dca.pmanager.documents.User;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User,String> {

}
