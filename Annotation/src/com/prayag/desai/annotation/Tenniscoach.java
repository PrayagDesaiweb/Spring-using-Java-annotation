package com.prayag.desai.annotation;

import org.springframework.stereotype.Component;

@Component("sillyCoach")
public class Tenniscoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
			return "Practice forehand and top-spin";
	}

}
