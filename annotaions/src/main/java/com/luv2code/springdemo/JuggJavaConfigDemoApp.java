package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JuggJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context=
			new AnnotationConfigApplicationContext(
					JuggAndBriliantCoachConfig.class);
		
		//call the bean from spring container
		Coach theCoach= context.getBean(
			"juggCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//call our nwe bike coach methods for the props value injection
		
	//	System.out.println("email: "+ theCoach.getEmail());
	//	System.out.println("team: "+theCoach.getTeam());
		
		// close the context
		context.close();
		
	}

}
