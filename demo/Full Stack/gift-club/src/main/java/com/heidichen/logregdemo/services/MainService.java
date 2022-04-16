package com.heidichen.logregdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heidichen.logregdemo.models.Gift;
import com.heidichen.logregdemo.repositories.GiftRepository;

@Service
public class MainService {

	@Autowired
	private GiftRepository giftRepo;
	
	// Find all gifts
	public List<Gift> allGifts(){
		return giftRepo.findAll();
	}
	
	// Find one gift using id
	public Gift findOneGift(Long id) {
		Optional<Gift> optionalGift = giftRepo.findById(id);
		if(optionalGift.isPresent()) {
			return optionalGift.get();
		}else {
			return null;
		}
	}
	
	// create gift
	public Gift createGift(Gift gift) {
		return giftRepo.save(gift);
	}
	
	// update gift
	public Gift updateGift(Gift gift) {
		return giftRepo.save(gift);
	}
	
	// delete gift using id
	public void deleteGift(Long id) {
		giftRepo.deleteById(id);
	}
	
	
	
}
