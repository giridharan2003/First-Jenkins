package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Hello {
	
	@GetMapping("/")
	public String getHello() {
		return "Hello Welcome To Jenkins";
	}
	
	@GetMapping("get")
	public String getExit() {
		return "Get Lost";
	}
	
	@GetMapping("give")
	public String getIN() {
		return "Get Hub";
	}
	
}
