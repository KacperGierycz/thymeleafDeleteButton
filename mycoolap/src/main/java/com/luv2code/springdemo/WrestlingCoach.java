package com.luv2code.springdemo;


public class WrestlingCoach implements Coach {
	private HappyFortuneService theFortuneService;
			
			
	public WrestlingCoach(HappyFortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Grab and Throw 100 times.";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
		
	}
	
	public void onInicializingJob() {			
		System.out.println("Wrestling onInicializingJob");
		
	}
	public void onDestroyJob() {
		
		System.out.println("Wrestling on onDestroyJob");
	}
}
