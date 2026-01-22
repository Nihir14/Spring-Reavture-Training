package com.nihir.rev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// This is the combination of three Annotations
// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan

@SpringBootApplication
public class RevApplication {

	public static void main(String[] args) {
		SpringApplication.run(RevApplication.class, args);

	}
}
