package com.beanLifeCycle;

public class TrackCoach implements Coach {

	public TrackCoach() {
		System.out.println("Default Constructor of TrackCoach invoked..");
	}
	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TrackCoach invoked..";
	}

	//init method
	public void performInit() {
		System.out.println("Performing init stuffs");
	}
	
	//destroy method
	public void performDestroy() {
		System.out.println("Performing destroy stuffs");
	}
}
