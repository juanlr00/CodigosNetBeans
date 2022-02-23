package com.example.ApiSpringBoot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages="models")
public class ApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringBootApplication.class, args);
	}

}
