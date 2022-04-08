package com.heidichen.firstspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// annotation 

@RestController
public class APIController {

	// Get, Post, Put , Delete
	
	// option 1   --- RequestMapping by default: GET
	@RequestMapping("/option1")
	public String hello() {
		return "Hello Spring";
	}
	
	// option 2 
	@RequestMapping(value = "/option2", method = RequestMethod.GET )
	public String hello2() {
		return "Hello Spring2";
	}
	
	// option 3
	@GetMapping("/option3") // @PostMapping , @PutMapping , @DeleteMapping
	public String hello3() {
		return "Hello Spring3";
	}
	

		
	
	
}
