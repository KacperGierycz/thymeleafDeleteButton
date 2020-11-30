package com.luv2code.springdemo;

public class BesebalCoach implements Coach {
	// define a private field for dependency
	private FortuneService fortuneService;
	
	// define constructor for dependency injection
	public BesebalCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
