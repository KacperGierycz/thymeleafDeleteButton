package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WrestlingPracticeScopeLifecycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(
					"wrestlingScope-applicationContext.xml");
			
			Coach theCoach=context.getBean("myCoach", Coach.class);
			
			Coach betaCoach=context.getBean( "myCoach", Coach.class);

			boolean scopeTest=theCoach==betaCoach;
			
			System.out.println("Are they the same: "+ scopeTest);
			System.out.println(betaCoach);
			System.out.println(theCoach);
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());
			System.out.println(betaCoach.getDailyFortune());
			
			
			
			context.close();
			
			
			
	}

}
