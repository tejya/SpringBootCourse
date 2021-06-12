package com.springdemo;

public class TrackCoach implements Coach{
private FortuneService fortuneService;

      public  TrackCoach(FortuneService fortuneService) {
    	  this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Track coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
		
		
		
		
	}

}
