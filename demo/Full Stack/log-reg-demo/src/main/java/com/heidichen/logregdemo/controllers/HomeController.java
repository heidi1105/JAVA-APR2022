package com.heidichen.logregdemo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.heidichen.logregdemo.models.LoginUser;
import com.heidichen.logregdemo.models.User;
import com.heidichen.logregdemo.services.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User()); // for register
        model.addAttribute("newLogin", new LoginUser()); // login
        return "logreg.jsp";
    }
	
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        
    	userService.register(newUser, result);
        
        if(result.hasErrors()) {
        	// check validation
            model.addAttribute("newLogin", new LoginUser()); // login
            return "logreg.jsp";
        }
        
        // No errors, store the id in session
        session.setAttribute("userId", newUser.getId());
    
        return "redirect:/home";
    }
    
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
         User user = userService.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User()); // to render register modelAttribute
            return "logreg.jsp";
        }
    
        // No errors, store the id in session
        session.setAttribute("userId", user.getId());
    
        return "redirect:/home";
    }   
	
}
