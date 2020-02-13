package com.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String... args) {
		
		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach1 = context.getBean("myCoachTrack", Coach.class);
		Coach theCoach2 = context.getBean("myCoachTrack", Coach.class);
		
		System.out.println("Both Object pointing to same instance : " + (theCoach1==theCoach2));
		context.close();
	}
}
