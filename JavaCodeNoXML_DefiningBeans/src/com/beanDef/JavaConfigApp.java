package com.beanDef;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
	public static void main(String... args) {

		// read spring config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		Coach theCoach = context.getBean("trackCoachBean", Coach.class);

		// call the method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}
}
