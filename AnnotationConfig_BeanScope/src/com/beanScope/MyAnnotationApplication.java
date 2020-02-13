package com.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAnnotationApplication {
	public static void main(String... args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach1 = context.getBean("myCoachTrack", Coach.class);
		Coach theCoach2 = context.getBean("myCoachTrack", Coach.class);

		// call the method on bean
		System.out.println("Pointing to Same bean reference : " + (theCoach1==theCoach2));

		// close the context
		context.close();

	}
}
