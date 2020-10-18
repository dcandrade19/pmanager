package com.dca.pmanager.handlers;

import com.dca.pmanager.documents.Client;
import com.dca.pmanager.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

import reactor.core.publisher.Mono;

@Component
public class ClientHandler {

    @Autowired
    ClientService clientService;

    public Mono<ServerResponse> findAll(ServerRequest request) {
        return ok().contentType(MediaType.APPLICATION_JSON).body(clientService.findAll(), Client.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok().contentType(MediaType.APPLICATION_JSON).body(clientService.findById(id), Client.class);
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        final Mono<Client> client = request.bodyToMono(Client.class);
        return ok().contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(client.flatMap(clientService::save), Client.class));

    }
}
