package com.dca.pmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class PmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmanagerApplication.class, args);
	}

}
