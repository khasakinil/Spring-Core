package com.qualifierInjection;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune() invoked from RestFortuneService";
	}

}
