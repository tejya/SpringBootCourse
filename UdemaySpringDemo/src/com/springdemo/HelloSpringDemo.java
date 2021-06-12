package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext classBean = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach bean = (Coach) classBean.getBean("myCoach");
		System.out.println(bean.getDailyWorkout());
		System.out.println(bean.getDailyFortune());
		
		Coach trackCoach = (Coach) classBean.getBean("trackCoach");
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getDailyFortune());

	}

}
