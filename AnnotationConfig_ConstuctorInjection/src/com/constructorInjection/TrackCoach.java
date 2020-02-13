package com.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	FortuneService fortuneService;
	
	@Autowired
	public TrackCoach(FortuneService fService) {
		fortuneService = fService;
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
