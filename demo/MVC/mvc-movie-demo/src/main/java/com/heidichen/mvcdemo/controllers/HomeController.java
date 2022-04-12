package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.heidichen.mvcdemo.models.Movie;
import com.heidichen.mvcdemo.services.MovieService;

@Controller
public class HomeController {

	@Autowired
	private MovieService movieService;
	
	// all movies dashboard
	@GetMapping("/movies")
	public String allMovies(Model model) {
		List<Movie> movies = movieService.allMovies();
		model.addAttribute("movies", movies);
		return "dashboard.jsp";
	}
	
	// find one
	@GetMapping("/movies/{id}")
	public String oneMovie(@PathVariable("id")Long id, Model model) {
		Movie oneMovie = movieService.findMovie(id);
		model.addAttribute("movie", oneMovie);
		return "oneMovie.jsp";
	}
	
	
}
