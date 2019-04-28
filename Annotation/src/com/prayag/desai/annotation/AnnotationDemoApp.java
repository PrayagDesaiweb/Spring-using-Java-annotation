package com.prayag.desai.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// reading the sptring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call a method of the bean
		System.out.print(theCoach.getDailyWorkout());
		// cloase the bean
		context.close();
	}

}
