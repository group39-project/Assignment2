package com.dypiemr.springdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MySpringIocApplication {

	public static void main(String[] args) {
		
		
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
		Coach theCoach=context.getBean("MyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		
		
	}

}
