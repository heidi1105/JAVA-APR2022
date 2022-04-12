package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	// find one : localhost:8080/api/movies/1 (Path Variable)
	@GetMapping("/api/movies/{id}")
	public Movie oneMovie(@PathVariable("id") Long id) {
		return movieService.findMovie(id);
	}
	
	// update : findOne + create
	@PutMapping("/api/movies/{id}")
	public Movie updateMovie(
			@PathVariable("id") Long id,
			@RequestParam("title") String title,
			@RequestParam("description") String description,
			@RequestParam("rating") Integer rating
			) {
		Movie updateMovie = movieService.findMovie(id);
		updateMovie.setTitle(title);
		updateMovie.setDescription(description);
		updateMovie.setRating(rating);
		return movieService.updateMovie(updateMovie);
	}
	
	@DeleteMapping("/api/movies/{id}")
	public void deleteMovie(@PathVariable("id")Long id) {
		movieService.deleteMovie(id);
	}
	
	
}
