package com.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
	public static void main(String... args) {

		// read spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		TrackCoach theCoach = context.getBean("trackCoach", TrackCoach.class);

		// call the method on bean
		System.out.println(theCoach.getDailyWorkout());

		System.out.println("Team:" + theCoach.getMyTeam() + ", Email:"+theCoach.getEmailId());
		// close the context
		context.close();

	}
}
