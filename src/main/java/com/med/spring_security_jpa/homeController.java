package com.med.spring_security_jpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@GetMapping("/")
	public String all() {
		return "<h1>welcome to home page</h1>";
	}
	
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome to user page</h1>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "<h1>Welcome to admin page</h1>";
	}
	
}
