package com.task.management.ui_web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
@MapperScan("com.task.management.ui_web.dao.mapper")
public class UiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiWebApplication.class, args);
	}
	
	  public void addResourceHandlers(final ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }
	

}
