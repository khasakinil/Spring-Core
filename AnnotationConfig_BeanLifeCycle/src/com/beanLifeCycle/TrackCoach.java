package com.beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("myCoachTrack")
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. (Annotation Config)";
	}
	
	@PostConstruct
	public void doMyStartup() {
		System.out.println("Performing Startup stuff");
	}

	@PreDestroy
	public void doMyCleanup() {
		System.out.println("Performing Cleanup stuff");
	}
}
