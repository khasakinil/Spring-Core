package com.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Value("${email}")
	private String emailId;
	
	@Value("${team}")
	private String myTeam;
	
	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked.. (JavaCode Config / NO-XML)";
	}

	public String getEmailId() {
		return emailId;
	}

	public String getMyTeam() {
		return myTeam;
	}

}
