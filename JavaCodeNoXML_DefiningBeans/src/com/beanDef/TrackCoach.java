package com.beanDef;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
