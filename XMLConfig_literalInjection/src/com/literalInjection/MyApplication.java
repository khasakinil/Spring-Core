package com.literalInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String... args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println("Email : " + theCoach.getEmail());
		System.out.println("Team : " + theCoach.getTeam());
		context.close();
	}
}
