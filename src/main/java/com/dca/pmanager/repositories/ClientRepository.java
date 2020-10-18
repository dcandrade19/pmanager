package com.dca.pmanager.repositories;

import com.dca.pmanager.documents.Client;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<Client, String> {

}
