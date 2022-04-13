package com.heidichen.mvcdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heidichen.mvcdemo.models.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
	// find all movies and return a list of movies
	List<Movie> findAll();
	

}
