package com.restassured.model;

public class AuthenticationBean {
	
	public String name;

	public AuthenticationBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AuthenticationBean(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AuthenticationBean [name=" + name + "]";
	}
}
