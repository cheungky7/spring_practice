package com.example.demo_jsp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo_jsp.mapper")
public class DemoJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJspApplication.class, args);
	}

}
