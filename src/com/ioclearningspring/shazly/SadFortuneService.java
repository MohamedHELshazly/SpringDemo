package com.ioclearningspring.shazly;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "today is a sad day From SadFortuneService";
	}

}
