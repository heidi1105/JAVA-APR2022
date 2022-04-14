package com.heidichen.onetomanydemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.heidichen.onetomanydemo.services.MainService;

@Controller
public class UserController {
	
	@Autowired
	private MainService mainService;

}
