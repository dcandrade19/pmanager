package com.dca.pmanager.routes;

import com.dca.pmanager.handlers.ClientHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class ClientRouter {

    @Bean
    public RouterFunction<ServerResponse> route(ClientHandler clientHandler) {

        RouterFunction<ServerResponse> route = RouterFunctions.route()
        .path("/api/clients", b1 -> b1
            .nest(accept(APPLICATION_JSON), b2 -> b2
                .GET("/", clientHandler::findAll)
                .GET("/{id}", clientHandler::findById))
            .POST("/", clientHandler::save))
        .build();

        return route;
    }
}
