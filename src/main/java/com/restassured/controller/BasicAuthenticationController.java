package com.restassured.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restassured.model.AuthenticationBean;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {

	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean()
	{
       return new AuthenticationBean("Yoqu are authenticated");		
	}
}
