package com.example.demo_jsp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_jsp.mapper.BookMapper;
import com.example.demo_jsp.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookMapper bookMapper;
	
	public List<Book> getAllBookInDB(){
		
		List<Book> books=bookMapper.getAll();
		return books;
	}

}
