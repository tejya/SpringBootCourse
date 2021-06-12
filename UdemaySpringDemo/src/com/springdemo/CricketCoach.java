package com.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice for bowling for 15 mins";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Set fortune service");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		
		
		+
		return fortuneService.getFortune();
	}

}
