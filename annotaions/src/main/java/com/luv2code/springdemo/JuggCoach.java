package com.luv2code.springdemo;

public class JuggCoach implements Coach {

	private FortuneService fortuneService;
	
	public JuggCoach(FortuneService theFortuneService) {
	fortuneService=theFortuneService;	
	}
	
	@Override
	public String getDailyWorkout() {
		return "thorow and catch balls 5000 times";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
