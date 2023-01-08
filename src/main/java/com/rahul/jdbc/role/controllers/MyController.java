package com.rahul.jdbc.role.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String Welcome() {
		return "<h2> Welcome To Role Base Auth using JDBC </h2>"; 
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h2> Welcome Admin :) </h2>"; 
	}
	
	
	@GetMapping("/user")
	public String user() {
		return "<h2>Welcome User :) </h2>"; 
	}
	
	

}
