package com.heidichen.onetomanydemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.heidichen.onetomanydemo.models.Movie;
import com.heidichen.onetomanydemo.models.User;
import com.heidichen.onetomanydemo.services.MainService;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	// create a new user 1. render the form, 2. process the form
	@GetMapping("/users/new")
	public String userForm(@ModelAttribute("user")User user) {
		return "newUserForm.jsp";
	}
	
	// process the form
	@PostMapping("/users/new")
	public String processUserForm(@Valid @ModelAttribute("user")User user,
			BindingResult result) {
		if(result.hasErrors()) {
			return "newUserForm.jsp";
		}else {
			mainService.createUser(user);
			return "redirect:/";
		}
	}
	
	
	// create a new movie 1. render the form 2. process the form
	@GetMapping("/movies/new")
	public String movieForm(@ModelAttribute("movie")Movie movie, Model model) {
		List<User> allUsers = mainService.allUsers();
		model.addAttribute("users", allUsers);
		return "newMovieForm.jsp";
	}
	
	// process the form
	@PostMapping("/movies/new")
	public String processMovieForm(@Valid @ModelAttribute("movie")Movie movie, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("users", mainService.allUsers());
			return "newMovieForm.jsp";
		}else {
			mainService.createMovie(movie);
			return "redirect:/";
		}
	}
	
	// one User
	@GetMapping("/users/{id}")
	public String showOneUser(@PathVariable("id")Long id, Model model) {
		model.addAttribute("user", mainService.findOneUser(id));
		return "oneUser.jsp";
	}
	
	// FORM WITH USER
	@GetMapping("/users/{userId}/new")
	public String oneUserWithForm(@PathVariable("userId")Long userId, Model model) {
		model.addAttribute("movie", new Movie());
		model.addAttribute("user", mainService.findOneUser(userId));
		return "oneUserWithForm.jsp";
	}
	
	@PostMapping("/users/{userId}/new")
	public String processUserMovieForm(@Valid @ModelAttribute("movie")Movie movie, BindingResult result, 
			Model model, @PathVariable("userId")Long userId) {
		if(result.hasErrors()) {
			model.addAttribute("user", mainService.findOneUser(userId));
			return "oneUserWithForm.jsp";
		}else {
			mainService.createMovie(movie);
			return "redirect:/";
		}
		
	}
	
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("users", mainService.allUsers());
		return "userDashboard.jsp";
	}
	
	
	
	
	
	
	
}
