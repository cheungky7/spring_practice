package com.task.management.ui_web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.task.management.ui_web.dao.mapper")
public class UiWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(UiWebApplication.class, args);
	}

}
