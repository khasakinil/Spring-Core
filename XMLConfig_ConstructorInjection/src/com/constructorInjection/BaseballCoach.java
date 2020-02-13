package com.constructorInjection;

public class BaseballCoach implements Coach {

	//define private  field for Dependency Injection
	private FortuneService fortuneService;
	
	//constructor for Dependency Injection
	public BaseballCoach(FortuneService service) {
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from BaseballCoach invoked..";
	}

	@Override
	public String getDailyFortune() {
		return "getDailyFortune() from BaseballCoach invoked.. ===> " + fortuneService.getFortune();
	}

}
