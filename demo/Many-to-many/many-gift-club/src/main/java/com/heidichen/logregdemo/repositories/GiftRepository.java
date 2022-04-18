package com.heidichen.logregdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heidichen.logregdemo.models.Gift;

@Repository
public interface GiftRepository extends CrudRepository<Gift, Long> {
	List<Gift> findAll();
}
