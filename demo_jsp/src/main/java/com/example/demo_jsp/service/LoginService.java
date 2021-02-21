package com.example.demo_jsp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String userid,String password) {
		boolean isValid=false;
		isValid=userid.equals("test") && password.equals("password");
		return isValid;
	}

}
