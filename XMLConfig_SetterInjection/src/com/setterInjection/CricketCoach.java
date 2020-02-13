package com.setterInjection;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setFortuneService(...) method");
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		System.out.println("Default-Constructor ");
	}

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from CricketCoach invoked..";
	}

	@Override
	public String getDailyFortune() {
		return "getDailyFortune() from BaseballCoach invoked.. ===> " + fortuneService.getFortune();
	}

}
