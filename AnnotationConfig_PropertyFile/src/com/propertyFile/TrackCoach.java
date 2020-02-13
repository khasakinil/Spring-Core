package com.propertyFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCoachTrack")
public class TrackCoach implements Coach {

	@Value("${email}")
	private String mailID;
	
	@Value("${team}")
	private String myTeam;
	
	
	public String getMailID() {
		return mailID;
	}


	public String getMyTeam() {
		return myTeam;
	}


	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. (Annotation Config)";
	}

}
