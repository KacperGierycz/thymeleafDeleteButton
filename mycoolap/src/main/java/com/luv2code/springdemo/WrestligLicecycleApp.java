package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WrestligLicecycleApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contest =
			new ClassPathXmlApplicationContext(
				"wrestlingLifeCycle-applicationContext.xml");
		
		Coach wrestlingCoach=contest.getBean("myCoach", Coach.class);
		
		System.out.println(wrestlingCoach.getDailyWorkout());
		contest.close();
	}

}
