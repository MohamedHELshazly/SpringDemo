package com.ioclearningspring.shazly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService _fortuneService) {
		fortuneService = _fortuneService;
	}
	// Autowired used for dependency injection
	@Autowired
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "start tossing some Tennis Balls";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
