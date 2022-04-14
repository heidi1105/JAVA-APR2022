package com.heidichen.onetomanydemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heidichen.onetomanydemo.models.Movie;
import com.heidichen.onetomanydemo.models.User;
import com.heidichen.onetomanydemo.repositories.MovieRepository;
import com.heidichen.onetomanydemo.repositories.UserRepository;

@Service
public class MainService {
	
	// import repo
	// OPTION 1
//	private final MovieRepository movieRepo;
//	private final UserRepository userRepo;
//	
//	public MovieService(MovieRepository movieRepo, UserRepository userRepo) {
//		this.movieRepo = movieRepo;
//		this.userRepo = userRepo
//	}
//	
	
	// OPTION 2
	@Autowired
	private MovieRepository movieRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	// CREATE USER
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	// find all users
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	
	// find one user
	public User findOneUser(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}else {
			return null;
		}
	}
	
	
	// CREATE MOVIE
	public Movie createMovie(Movie movie) {
		return movieRepo.save(movie);
	}
	
	
	
	
	
	
	

}
