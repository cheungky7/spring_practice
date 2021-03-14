package com.task.management.ui_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping(value = "/auth")
public class LoginController {
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		
		
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String submitLoginPage(@RequestParam String name,
			@RequestParam String password,
			ModelMap model) {
		
		
		return "MainMenu";
	}
	

}
