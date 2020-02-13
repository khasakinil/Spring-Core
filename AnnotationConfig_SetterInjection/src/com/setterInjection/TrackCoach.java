package com.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	FortuneService fortuneService;
	
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//default constructor
	public TrackCoach() {
		System.out.println("inside TrackCoach() default Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. (Annotation Config)";
	}

	@Override
	public String getDailyFortune() {
		return "getDailyFortune() from TrackCoach invoked.. (Annotation Config) ==> " + fortuneService.getFortune();
	}

}
