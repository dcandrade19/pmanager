package com.dca.pmanager.services;

import com.dca.pmanager.documents.Client;
import com.dca.pmanager.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> findById(String id) {
        return clientRepository.findById(id);
    }

    @Override
    public Mono<Client> save(Client client) {
        return clientRepository.save(client);
    }

}
