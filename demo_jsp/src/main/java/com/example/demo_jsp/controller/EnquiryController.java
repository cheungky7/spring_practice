package com.example.demo_jsp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo_jsp.model.Enquiry;
import com.example.demo_jsp.service.LoginService;

@Controller
@SessionAttributes("name")
public class EnquiryController {
	
	Logger logger = LogManager.getLogger(EnquiryController.class);
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/enquiry",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		
		//model
		
		return "Enquiry";
	}
	
	
	@RequestMapping(value="/enquiry",method=RequestMethod.POST)
	public String showWelcomePage(@ModelAttribute("Enquiry")Enquiry enquiry, 
			   ModelMap model) {
		
		//boolean isValidUser=service.validateUser(name,password);
		/*
		if(!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name",name);*/
		logger.info(enquiry.getName());
		logger.info(enquiry.getEmail());
		logger.info(enquiry.getTopic());
		logger.info(enquiry.getQuestion());
		
		return "Enquiry";
	}

}