package com.propertyFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApplication {

	public static void main(String... args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		TrackCoach theCoach = context.getBean("myCoachTrack", TrackCoach.class);

		// call the method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("Email:" + theCoach.getMailID() + ", Team:" + theCoach.getMyTeam());
		// close the context
		context.close();

	}
}
