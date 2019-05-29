package com.ioclearningspring.shazly;

public class MyApp {

	public static void main(String[] args) {
		// creat object 
		Coach theCoach = new TrackCoach();
		
		// use that object
		System.out.println(theCoach.getDailyWorkout());

	}

}
