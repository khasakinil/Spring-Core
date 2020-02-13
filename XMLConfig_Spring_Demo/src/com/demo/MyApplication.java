package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String... args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoachTrack", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}
}
