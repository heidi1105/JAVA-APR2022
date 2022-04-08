package com.heidichen.firstjspdemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.heidichen.firstjspdemo.models.Assignment;

// 1. annotation

@Controller // for jsp files
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("/jstl")
	public String jstlTest(Model model) {
		Integer age = 13;
		String name = "Pepper";
		Boolean alive = true;
		Boolean hungry = false;
		
		model.addAttribute("jspAge", age);
		model.addAttribute("jspName", name);
		model.addAttribute("jspAlive", alive);
		model.addAttribute("jspHungry", hungry);
		
		
		// ----------JSTL FOR EACH -----------
		ArrayList<String> pets = new ArrayList<>();
		pets.add("Pepper");
		pets.add("Marley");
		pets.add("Cooper");
		pets.add("Gigi");
		model.addAttribute("jspPets", pets);
		
		for(String pet: pets) {
			System.out.println(pet);
		}
		
		
		
		return "jstl.jsp";
	}
	
	
	@GetMapping("/assignments")
	public String assignmentsLoop(Model model) {
		Assignment a1 = new Assignment("JAVA", 12);
		Assignment a2 = new Assignment("MERN", 14);
		Assignment a3 = new Assignment("PYTHON", 16);
		
		ArrayList<Assignment> assignments = new ArrayList<>();
		assignments.add(a1);
		assignments.add(a2);
		assignments.add(a3);
		
		model.addAttribute("assignments", assignments);
		
		
		return "assignmentLoop.jsp";
	}
	
}
