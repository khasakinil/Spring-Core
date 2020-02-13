package com.qualifierInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	FortuneService fortuneService;
	
	@Autowired
	//@Qualifier("RESTFortuneService")
	//@Qualifier("randomFortuneService")
	//@Qualifier("databaseFortuneService")
	@Qualifier("happyFortuneService")
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
