package com.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApplication {
	public static void main(String... args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);

		// call the method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}
}
