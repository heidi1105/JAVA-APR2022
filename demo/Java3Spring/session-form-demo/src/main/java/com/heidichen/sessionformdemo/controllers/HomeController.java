package com.heidichen.sessionformdemo.controllers;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@GetMapping("/getCount")
	public String getCount() {
		return "getSession.jsp";
	}

	@GetMapping("/setCount")
	public String setCount(HttpSession session) {
		// if count variables inside session is null, set count to 1
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 1);	
		}else { // if count variable inside session is present, increment count
			Integer tempCount = (Integer) session.getAttribute("count");
			tempCount++;
			session.setAttribute("count", tempCount);
		}
		return "setSession.jsp";
	}
	
	// ---------------- GET METHOD --------------
	// RENDER THE FORM
	@GetMapping("/searchForm")
	public String searchForm() {
		return "searchForm.jsp";
	}
	
	// PROCESS + DISPLAY RESULT
	@GetMapping("/search")
	public String processDisplaySearchForm(
			@RequestParam("keyword") String keyword, 
			Model model) {
		model.addAttribute("keyword", keyword);
		return "searchResult.jsp";
	}
	
	
	// ---------------POST METHOD FORM---------------
	// render the form
	@GetMapping("/reviewForm")
	public String reviewForm() {
		return "form.jsp";
	}
	
	// process the form
	@PostMapping("/processReview")
	public String processReview(
			@RequestParam("reviewer") String reviewer,
			@RequestParam("product") String product,
			@RequestParam("comment") String comment,
			@RequestParam("rating") Integer rating,
			HttpSession session,
			RedirectAttributes redirectAttributes
			) {
		if(rating < 0) {
			redirectAttributes.addFlashAttribute("errors", "Rating must be positive");
			return "redirect:/reviewForm";
		}	
		session.setAttribute("reviewer", reviewer);
		session.setAttribute("product", product);
		session.setAttribute("comment", comment);
		session.setAttribute("rating", rating);
		return "redirect:/reviewResult";
	}
	
	
	// display the form
	@GetMapping("/reviewResult")
	public String reviewResult() {
		return "formResult.jsp";
	}
	
	// -------------- (POST) Form with date/time -------------
	// Render the form
	@GetMapping("/reservation")
	public String reservationForm() {
		return "reservationForm.jsp";
	}
	
	
	// process the form
	@PostMapping("/reservation")
	public String processReservation(
			@RequestParam("name") String name,
			@RequestParam("numOfPeople") Integer numOfPeople,
			@RequestParam("resDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date resDate,
			@RequestParam("resTime") @DateTimeFormat(pattern="HH:mm") Date resTime,
			HttpSession session
			) {
		session.setAttribute("name", name);
		session.setAttribute("numOfPeople", numOfPeople);
		session.setAttribute("resDate", resDate);
		session.setAttribute("resTime", resTime);
		return "redirect:/reservationResults";
	}
	
	
	
	// display result
	@GetMapping("/reservationResults")
	public String reservationResult() {
		return "reservationResult.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
