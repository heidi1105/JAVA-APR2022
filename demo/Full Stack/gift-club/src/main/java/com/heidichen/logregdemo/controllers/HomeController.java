package com.heidichen.logregdemo.controllers;

import javax.servlet.http.HttpSession;
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

import com.heidichen.logregdemo.models.Gift;
import com.heidichen.logregdemo.services.MainService;

@Controller
public class HomeController {

	@Autowired
	private MainService mainService;
	
	@GetMapping("/home")
	public String home(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		
		
		model.addAttribute("gifts", mainService.allGifts());
		return "home.jsp";
	}
	
	@GetMapping("/gifts/new")
	public String newGiftForm(@ModelAttribute("gift")Gift gift) {
		return "newGift.jsp";
	}
	
	@PostMapping("/gifts/new")
	public String processCreateGift(@Valid @ModelAttribute("gift")Gift gift,
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "newGift.jsp";
		}else {
			mainService.createGift(gift);
			return "redirect:/home";
		}	
	}
	
	@GetMapping("/gifts/{id}/edit")
	public String editGiftForm(Model model, @PathVariable("id")Long id) {
		model.addAttribute("gift", mainService.findOneGift(id));
		return "editGift.jsp";
	}
	
	@PutMapping("/gifts/{id}/edit")
	public String processEditGift(@Valid @ModelAttribute("gift")Gift gift,
			BindingResult result) {
		if(result.hasErrors()) {
			return "editGift.jsp";
		}else {
			mainService.updateGift(gift);
			return "redirect:/home";
		}
	}
	
	@DeleteMapping("/gifts/{id}/delete")
	public String deleteGift( @PathVariable("id")Long id) {
		mainService.deleteGift(id);
		return "redirect:/home";
	}
	
}













