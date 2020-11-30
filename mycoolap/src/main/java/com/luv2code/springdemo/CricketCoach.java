package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	// adding additional fields email and team
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricetCoach: inside note of noArgsConstructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricetCoach: inside note of seterOfFortuneService");

		this.fortuneService = fortuneService;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricetCoach: inside note of setEmailAddress");

		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("CricetCoach: inside note of setTeam");
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minute";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}

}
