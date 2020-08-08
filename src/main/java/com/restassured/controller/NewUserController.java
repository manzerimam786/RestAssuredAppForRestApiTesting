package com.restassured.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restassured.model.NewUser;
import com.restassured.service.impl.NewUserServiceImpl;

@RestController
public class NewUserController {

	@Autowired
	NewUserServiceImpl newUserServiceImpl;
	
	@RequestMapping(value="/createNewUser", method=RequestMethod.POST)
	public ResponseEntity<Void> createNewUser(@RequestBody NewUser newUser){
		newUserServiceImpl.createNewUser(newUser);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/getAllUsers", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<NewUser>> getAllUsers(){
		List<NewUser> users = newUserServiceImpl.getAllUsers();
		return new ResponseEntity<List<NewUser>>(users,HttpStatus.OK);
	}
}
