package com.springboot.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUsername = username.equalsIgnoreCase("user");
		boolean isValidPassword = password.equalsIgnoreCase("pass");
		
		return isValidUsername && isValidPassword;
	}
}
