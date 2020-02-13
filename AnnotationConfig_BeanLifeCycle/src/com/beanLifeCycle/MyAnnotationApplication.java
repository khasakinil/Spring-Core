package com.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApplication {
	public static void main(String... args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach1 = context.getBean("myCoachTrack", Coach.class);
		
		System.out.println(theCoach1.getDailyWorkout());
		// close the context
		context.close();

	}
}
