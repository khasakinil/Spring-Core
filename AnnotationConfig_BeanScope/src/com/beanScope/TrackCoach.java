package com.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCoachTrack")
@Scope("prototype")
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. (Annotation Config)";
	}

}
