package com.ioclearningspring.shazly;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Today is a good day from HappyFortuneService";
	}

}
