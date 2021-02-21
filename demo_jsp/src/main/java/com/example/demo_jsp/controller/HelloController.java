package com.example.demo_jsp.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class HelloController {
	
	Logger logger = LogManager.getLogger(HelloController.class);
	
	
	//@GetMapping({"/","/hello"})
	 @RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello(Model model,@RequestParam(value="name",required=false,defaultValue="World") String name) {
		 
		logger.info("Enter helloController");
		
		model.addAttribute("name", name);
		return "hello";
	}
}
