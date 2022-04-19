package com.heidichen.logregdemo.controllers;

import java.util.List;

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

import com.heidichen.logregdemo.models.Project;
import com.heidichen.logregdemo.models.User;
import com.heidichen.logregdemo.services.ProjectService;
import com.heidichen.logregdemo.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/dashboard")
	public String dashboard(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		// get user
		Long userId = (Long) session.getAttribute("userId");
		User user = userService.findOneUser(userId);
		// get the list of project
		List<Project> projects = projectService.allProjects();
		
		
		// put the variable into jsp
		model.addAttribute("user", user);
		model.addAttribute("projects", projects);
		
		return "dashboard.jsp";
		
	}
	
	
	// create ---- render the form, process form
	@GetMapping("/projects/new")
	public String newProject(@ModelAttribute("project") Project project) {
		return "newProject.jsp";
	}
	
	// process form
	@PostMapping("/projects/new")
	public String processCreate(@Valid @ModelAttribute("project") Project project, BindingResult result) {
		if(result.hasErrors()) {
			return "newProject.jsp";
		}else {
			projectService.createProject(project);
			return "redirect:/dashboard";
		}
	}
	
	// edit
	@GetMapping("/projects/{id}/edit")
	public String editForm(@PathVariable("id")Long id, Model model) {
		Project project = projectService.findOneProject(id);
		model.addAttribute("project", project);
		return "editProject.jsp";
	}
	
	@PutMapping("/projects/{id}/edit")
	public String processEdit(@Valid @ModelAttribute("project") Project project, BindingResult result) {
		if(result.hasErrors()) {
			return "editProject.jsp";
		}else {
			projectService.updateProject(project);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/projects/{id}")
	public String oneProject(@PathVariable("id")Long id, Model model) {
		model.addAttribute("project", projectService.findOneProject(id));
		return "oneProject.jsp";
	}
	
	@DeleteMapping("/projects/{id}/delete")
	public String deleteProject(@PathVariable("id")Long id) {
		projectService.deleteProject(id);
		return "redirect:/dashboard";
	}
	
	

}
