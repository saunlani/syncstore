package com.sync.purchase;

/* these imports and the spring boot application annotation are required for all 
 * Spring Boot Applications */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}

