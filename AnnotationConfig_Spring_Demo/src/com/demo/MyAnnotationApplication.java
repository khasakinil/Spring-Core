package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApplication {
	public static void main(String... args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("myCoachTrack", Coach.class);

		// call the method on bean
		System.out.println(theCoach.getDailyWorkout());

		// close the context
		context.close();

	}
}
