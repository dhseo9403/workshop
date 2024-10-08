package com.test.myapp13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Myapp13Application {
	public static void main(String[] args) {
		SpringApplication.run(Myapp13Application.class, args);
	}
	@GetMapping("/message")
	public String getMessage() {
		return "Spring Boot App";
	}
	// http://localhost:8080/message
}
