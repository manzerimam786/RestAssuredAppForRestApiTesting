package com.cucumber;

public class Response {
	int statusCode;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(int statusCode) {
		super();
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "Respopnse [statusCode=" + statusCode + "]";
	}
	

}
