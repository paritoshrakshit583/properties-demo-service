package com.demo.microservices.demopropertyaccessservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private User user;
	
	@Autowired
	private UserConfigDemo userConfigDemo;
	
	@GetMapping("/user")
	public String getUsers() {
		System.out.println("System Properties : \n"+user.getSystemProps());
		return user.toString();
	}
	
	@GetMapping("/userConfig")
	public String getUserConfig() {
		return userConfigDemo.toString();
	}
}
