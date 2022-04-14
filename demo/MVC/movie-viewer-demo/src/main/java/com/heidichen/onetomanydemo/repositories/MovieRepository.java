package com.heidichen.onetomanydemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heidichen.onetomanydemo.models.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

	List<Movie> findAll();
}
