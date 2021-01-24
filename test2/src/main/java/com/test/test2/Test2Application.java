package com.test.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test2Application {

	/*
	public static void main(String[] args) {
		//SpringApplication.run(Test2Application.class, args);
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();
	}*/

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach",Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

		boolean result= (theCoach==alphaCoach);

		System.out.println("\nPointing to the same object:"+result);

		System.out.println("\nMemory location for theCoach:"+theCoach);

		System.out.println("\nMemory location for alphaCoach:"+alphaCoach);
	}

}
