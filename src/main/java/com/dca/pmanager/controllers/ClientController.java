package com.dca.pmanager.controllers;

import com.dca.pmanager.documents.Client;
import com.dca.pmanager.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@RestController
@RequestMapping(value = "/api")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping(value = "/clients")
    public Flux<Client> getClients() {
        return clientService.findAll();
    }

    @GetMapping(value = "/clients/{id}")
    public Mono<Client> getClient(@PathVariable String id) {
        return clientService.findById(id);
    }

    @PostMapping(value = "/clients")
    public Mono<Client> saveClient(@RequestBody Client client) {
        return clientService.save(client);
    }
}
