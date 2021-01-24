package com.test.test2;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/

	public TennisCoach(){
		System.out.println(">> TennisCoach: inside default constructor");
	}

	@Autowired
	public void setFortuneService(FortuneService theFortuneService){
		System.out.println(">> TennisCoach: inside default constructor");
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
