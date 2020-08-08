package com.restassured.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restassured.model.NewUser;
import com.restassured.repository.NewUserRepository;

@Service
public class NewUserServiceImpl {
	
	@Autowired
	NewUserRepository newUserRepository;
	
	public void createNewUser(NewUser newUser)
	{
		System.out.println(newUser.getEmail()+" ,"+newUser.getPassword());
		newUserRepository.save(newUser);
	}

	public List<NewUser> getAllUsers() {
		List<NewUser> listOfUsers = newUserRepository.findAll();
		System.out.println("Size of list ="+listOfUsers.size());
		return listOfUsers;
	}
}
