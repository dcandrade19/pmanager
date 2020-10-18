package com.dca.pmanager;

import java.util.UUID;

import com.dca.pmanager.documents.User;
import com.dca.pmanager.repositories.UserRepository;
import com.dca.pmanager.services.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/*
 * @Component public class DataRunner implements CommandLineRunner {
 * 
 * private final UserRepository userRepository; private final UserService
 * userService;
 * 
 * DataRunner(UserRepository userRepository, UserService userService) {
 * this.userRepository = userRepository; this.userService = userService; }
 * 
 * @Override public void run(String... args) throws Exception {
 * 
 * // Mono.just(new User(UUID.randomUUID().toString(), //
 * "admin")).flatMap(userRepository::save)
 * 
 * userService.save(new User(UUID.randomUUID().toString(),
 * "admin")).subscribe(System.out::println);
 * 
 * }
 * 
 * }
 */
