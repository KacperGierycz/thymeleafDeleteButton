package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	public String[] fortunes
	={"This is your lucky day", "Gold is waiting for you", "World gave you a chance"};
	//int takeFortune=(int)Math.random()*2+0;
	public Random myRandom = new Random();
	public String[] getFortunes() {
		return fortunes;
	}
	public void setFortunes(String[] fortunes) {
		System.out.println("fortunes inicializing");
		this.fortunes = fortunes;
	}
	@Override
	public String getFortune() {
	System.out.println("fortunes read");
	int index = myRandom.nextInt(fortunes.length);
		return fortunes[index];
	}

}
