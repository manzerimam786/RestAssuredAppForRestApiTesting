package com.restassured;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {SecurityAutoConfiguration.class })
public class RestAssuredAppForRestApiTesting {

	public static void main(String[] args) {
		SpringApplication.run(RestAssuredAppForRestApiTesting.class, args);
	}

}
