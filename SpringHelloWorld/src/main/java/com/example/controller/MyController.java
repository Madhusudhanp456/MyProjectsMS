package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping
	public String getHello() {
		return "Hello Spring Boot ";
	}
	
	@RequestMapping("/Hello")
	public String getHello1() {
		return "Hello Spring Boot 2 ";
	}
}
