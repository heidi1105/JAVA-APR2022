package com.heidichen.sessionformdemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/getCount")
	public String getCount() {
		return "getSession.jsp";
	}

	@GetMapping("/setCount")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 1);	
		}else {
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
			HttpSession session
			) {
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
