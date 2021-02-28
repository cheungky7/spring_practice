package com.task.managment.ui_web.controller;



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

import com.task.managment.model.Task;



@Controller
@RequestMapping(value = "/task")
public class TasksController {
	
	Logger logger = LogManager.getLogger(TasksController.class);
	/*
	@Autowired
	LoginService service;
	*/
	
	@RequestMapping(value="/enquiry",method=RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		
		//model
		
		return "Enquiry";
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addTasks(@ModelAttribute("Task")Task task, 
			   ModelMap model) {
		
		//boolean isValidUser=service.validateUser(name,password);
		/*
		if(!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name",name);*/
		logger.info(task.getTile());
		logger.info(task.getContent());
		//logger.info(task.getAssignedDate());
		logger.info(task.getDeadline());
		
		return "AddTask";
	}

}