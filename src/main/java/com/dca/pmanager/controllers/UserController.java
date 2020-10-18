package com.dca.pmanager.controllers;

import com.dca.pmanager.documents.User;
import com.dca.pmanager.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/users")
    public Flux<User> getUsers() {
        return userService.findAll();
    }

}
