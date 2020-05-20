package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.demo"})  // scan JPA entities
@EnableConfigurationProperties
@EnableAutoConfiguration
public class AwsEbSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsEbSpringBootApplication.class, args);
	}

}
