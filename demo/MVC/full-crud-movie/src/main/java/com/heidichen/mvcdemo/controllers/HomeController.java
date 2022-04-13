package com.heidichen.mvcdemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	
	// CreateForm -- 1. render the form 2. process the form
	// render form: option 1
	@GetMapping("/movies/new")
	public String renderCreateForm(@ModelAttribute("movie") Movie movie) {
		return "createMovieForm.jsp";
	}
	
	// render form: option 2
	@GetMapping("/movies/new2")
	public String renderCreateForm2(Model model) {
		Movie emptyMovie = new Movie();
		//emptyMovie.setTitle("testing");
		model.addAttribute("movie", emptyMovie);
		return "createMovieForm.jsp";
	}
	
	// process the form
	@PostMapping("/movies/new")
	public String processCreateMovie(@Valid @ModelAttribute("movie") Movie movie,
			BindingResult result) {
		if(result.hasErrors()) {
			return "createMovieForm.jsp";
		}else {
			movieService.createMovie(movie);
			return "redirect:/movies";
		}
	}
	
	// editForm -- 1. render the form 2. process the form
	// render the form --- findOne + create
	@GetMapping("/movies/{id}/edit")
	public String renderEditForm(@PathVariable("id")Long id, Model model) {
		Movie oneMovie = movieService.findMovie(id);
		model.addAttribute("movie", oneMovie);
		return "editMovie.jsp";
	}
	
	// process the edit
	@PutMapping("/movies/{id}/edit")
	public String processEdit(@Valid @ModelAttribute("movie") Movie movie,
			BindingResult result) {
		if(result.hasErrors()) {
			return "editMovie.jsp";
		}else {
			movieService.updateMovie(movie);
			return "redirect:/movies";
		}	
	}
	
	// delete method
	@DeleteMapping("/movies/{id}")
	public String deleteMovie(@PathVariable("id")Long id) {
		movieService.deleteMovie(id);
		return "redirect:/movies";
	}
	
	
	// COMBINE DASHBOARD + CREATE FORM
	// render dashboard and the form
	@GetMapping("/")
	public String combineFormDashboard(Model model) {
		model.addAttribute("movies", movieService.allMovies());
		model.addAttribute("movie", new Movie());
		return "combinedHome.jsp";
	}
	
	// process the form inside combined home
	@PostMapping("/createProcess")
	public String processCombine(@Valid @ModelAttribute("movie")Movie movie, 
			BindingResult result, Model model) {
		if(result.hasErrors()) { // does not pass validation
			// add attribute for the list of movies 
			model.addAttribute("movies", movieService.allMovies());
			return "combinedHome.jsp";
		}else {
			movieService.createMovie(movie);
			return "redirect:/";
		}
	}
	
	
	
	
}
