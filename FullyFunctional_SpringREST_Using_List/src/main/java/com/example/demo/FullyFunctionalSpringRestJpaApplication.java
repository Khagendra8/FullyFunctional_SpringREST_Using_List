package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springrest.controller","com.springrest.services"})
@EnableAutoConfiguration
public class FullyFunctionalSpringRestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullyFunctionalSpringRestJpaApplication.class, args);
	}

}
