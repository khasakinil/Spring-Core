package com.qualifierInjection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("Inside HappyFortuneService() default constructor");
	}
	
	@Override
	public String getFortune() {
		return "getFortune() invoked from HappyFortuneService";
	}

}
