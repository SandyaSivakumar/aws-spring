package com.sandya.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsApplication {

	@GetMapping("/")
	public String init(){
		return "You are seeing Application for first time";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsApplication.class, args);
	}

}
