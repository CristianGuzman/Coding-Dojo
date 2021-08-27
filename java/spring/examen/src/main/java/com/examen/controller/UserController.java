package com.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.examen.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	

}
