package com.demo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. (JavaCode Config / NO-XML..)";
	}

}
