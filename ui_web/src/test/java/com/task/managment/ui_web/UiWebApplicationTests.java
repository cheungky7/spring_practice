package com.task.managment.ui_web;

//import org.junit.jupiter.api.Test;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.task.management.ui_web.UiWebApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = UiWebApplication.class)
class UiWebApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("hello testing");
	}

}
