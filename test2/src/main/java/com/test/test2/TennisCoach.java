package com.test.test2;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	public TennisCoach(){
		System.out.println(">> TennisCoach: inside default constructor");
	}
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService){
		System.out.println(">> TennisCoach: inside default constructor");
		fortuneService=theFortuneService;
	}
	
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService){
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		fortuneService=theFortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
