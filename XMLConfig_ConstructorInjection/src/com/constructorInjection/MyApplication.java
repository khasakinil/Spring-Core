package com.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String... args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myTrack", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}
}
