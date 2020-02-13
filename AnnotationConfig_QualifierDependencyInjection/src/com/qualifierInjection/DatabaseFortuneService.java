package com.qualifierInjection;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune() invoked from DatabaseFortuneService";
	}

}
