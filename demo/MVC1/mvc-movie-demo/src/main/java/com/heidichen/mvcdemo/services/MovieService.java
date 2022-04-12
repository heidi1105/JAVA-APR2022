package com.heidichen.mvcdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.heidichen.mvcdemo.models.Movie;
import com.heidichen.mvcdemo.repositories.MovieRepository;

@Service
public class MovieService {
	
	// import repo
	// option 1 
	private final MovieRepository movieRepo;
	
	public MovieService(MovieRepository movieRepo) {
		this.movieRepo = movieRepo;
	}
	
	// option 2
//	@Autowired
//	private MovieRepository movieRepo;
	
	// find all movies
	public List<Movie> allMovies(){
		return movieRepo.findAll();
	}
	
	// find one movie
	
	
	// create a movie
	public Movie createMovie(Movie movie) {
		return movieRepo.save(movie);
	}
	
	
	// update a movie
	
	// delete a movie
	
	

}
