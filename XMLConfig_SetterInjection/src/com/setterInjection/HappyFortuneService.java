package com.setterInjection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "getFortune() method invoked from HappyFortuneService";
	}

}
