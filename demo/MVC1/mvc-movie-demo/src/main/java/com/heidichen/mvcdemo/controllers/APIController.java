package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Movie;
import com.heidichen.mvcdemo.services.MovieService;

@RestController
public class APIController {

	private final MovieService movieService;
	
	public APIController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	// find all movies
	@GetMapping("/api/movies")
	public List<Movie> findAllMovies(){
		return movieService.allMovies();
	}
	
	// create a movie
	@PostMapping("/api/movies")
	public Movie createMovie(
		@RequestParam("title") String title,
		@RequestParam("description") String description,
		@RequestParam("rating") Integer rating
			) {
		Movie newMovie = new Movie(title, description, rating);
		return movieService.createMovie(newMovie);
	}
	
	
	
}
