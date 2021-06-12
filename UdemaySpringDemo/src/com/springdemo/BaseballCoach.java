package com.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spent 30 mins for basket ball practise";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}
}
