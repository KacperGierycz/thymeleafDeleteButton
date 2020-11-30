package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext
				("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);
	
		// check if the are the same
		boolean checker=theCoach==alphaCoach;
		
		// printing out the result
		System.out.println("\nAre the beans refere"
				+ " to the same object: "+ checker);
		
		System.out.println("\nMemory location for"
				+ " theCoach: "+ theCoach);
		
		System.out.println("\nMemory location for"
				+ " theCoach: "+ alphaCoach + "\n");
		
		// close the context 
		context.close();
	}

}
