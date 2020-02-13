package com.constructorInjection;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() invoked from TrackCoach invoked..";
	}

	@Override
	public String getDailyFortune() {
		return "getDailyFortune() invoked from TrackCoach invoked.. ===> " + fortuneService.getFortune();
	}

}
