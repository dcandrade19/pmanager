package com.dca.pmanager.services;

import com.dca.pmanager.documents.Client;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    
    Flux<Client> findAll();

    Mono<Client> findById(String id);

    Mono<Client> save(Client client);
}
