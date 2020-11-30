package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	public TrackCoach() {
	}

	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		return "Get do it: "+ fortuneService.getFortune();
	}
	
	// initialization method
	public void doMineStartupStuff() {
		System.out.println("TrackCoach: inside method doMineStartupStuff");
	}
	// add destroy method
	public void doMineCleanUpStuffYoYo() {
		System.out.println("TrackCoach: inside method doMineCleanUpStuffYoYo");
	}

}
