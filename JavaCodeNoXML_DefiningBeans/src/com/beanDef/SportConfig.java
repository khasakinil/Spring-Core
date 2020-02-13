package com.beanDef;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo")
public class SportConfig{

	//define method to expose bean
	@Bean
	public FortuneService happyfoFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach trackCoachBean() {
		return new TrackCoach(happyfoFortuneService());
	}
}
