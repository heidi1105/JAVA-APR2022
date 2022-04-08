package com.heidichen.firstspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutesController {
	
	// ---------------QUERY PARAMS--------------
	
	@RequestMapping("/")
	public String searchKeyword(@RequestParam("q") String keyword) { // localhost:8080/search?q=whataever
		String result = "You searched for " + keyword;
		return result;
	}
	
	@RequestMapping("/pet")
	public String getPet(@RequestParam("name") String petName, @RequestParam("age") Integer age) {
		return "Your pet " +petName + " is " + age + " years old";
	}
	
	@RequestMapping("/optionalPet")
	public String getOptionalPet(
			@RequestParam(value="name", required=false) String petName, 
			@RequestParam(value="age", required=false) Integer age) {
		if(age ==null) {
			return petName + " has no age";
		}else {
			return "Your optional pet " +petName + " is " + age + " years old";		
		}
	}
	
	// --------------- PATH VARIABLES --------------
	@RequestMapping("/path/{name}/{color}")
	public String pathDemo(@PathVariable("name") String petName, @PathVariable("color") String color) {
		
		return "PATH: Your pet " +petName + " is " +  color;
	}
	
	
	

}
