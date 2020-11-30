package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Lazy
@Component

public class TennisCoach implements Coach {
	
	@Qualifier("randomFortuneService")
	@Autowired
	FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">> TennisCoach default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void soMyStartupStuff() {
		System.out.println(">> TennisCoach: do mine"
				+ "startup stuff");
	}
	
	//define my  destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennisCoach: inside of"
				+ "doMyCleanupStuff");
	}
	
	/*
	// define a setter method
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach doSomeCrazyStuff");

		this.fortuneService = fortuneService;
	}
	*/

	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService=theFortuneService;
		
	}
	*/
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
 