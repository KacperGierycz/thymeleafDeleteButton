package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JuggAndBriliantCoachConfig {
	
	@Bean
	public BriliantFortuneService briliantFortuneService() {
		return new BriliantFortuneService();
	}
	
	@Bean
	public Coach juggCoach(){
		JuggCoach myJuggCoach=
		new JuggCoach(briliantFortuneService());
		return myJuggCoach;
	}

}
