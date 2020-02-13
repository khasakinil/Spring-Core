package com.demo;

import org.springframework.stereotype.Component;

@Component("myCoachTrack")
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. (Annotation Config)";
	}

}
