package com.task.management.ui_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {
	
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		
		
		return "MainMenu";
	}

}
