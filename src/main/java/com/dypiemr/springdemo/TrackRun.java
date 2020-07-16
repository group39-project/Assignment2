package com.dypiemr.springdemo;

import org.springframework.stereotype.Component;

@Component("MyCoach")
public class TrackRun implements Coach {

	public String getDailyWorkout()
	{
		return("10km run");
		
	}	
}
