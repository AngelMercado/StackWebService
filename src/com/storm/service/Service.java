package com.storm.service;

import com.storm.domain.User;

public class Service {
	String message;
	
	public String getUserDetails(User user){
		this.message = "detalles del usuario: "+ user.getName();
		
		
		return message;
	}
	
}
