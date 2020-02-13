package com.constructorInjection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "getFortune() invoked from HappyFortuneService";
	}

}
