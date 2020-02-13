package com.qualifierInjection;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune() invoked from RandomFortuneService";
	}

}
