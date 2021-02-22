package com.example.demo_jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo_jsp.model.Book;
import com.example.demo_jsp.service.BookService;


@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	Logger logger = LogManager.getLogger(BookController.class);

	 @RequestMapping(value="/Book", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		 
		//logger.info("Enter helloController");
		List<Book> books= service.getAllBookInDB();
		List<String> booknames=new ArrayList<String>();
		for(int i=0 ; i<books.size();i++) {
			booknames.add(books.get(i).getName());
		}
		
		model.put("booknames", booknames);
		
		//model.addAttribute("name", name);
		return "Book";
	}
}