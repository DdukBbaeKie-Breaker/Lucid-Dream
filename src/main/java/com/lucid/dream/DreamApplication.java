package com.lucid.dream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DreamApplication {

	public static void main(String[] args) {

		SpringApplication.run(DreamApplication.class, args);
	}

}