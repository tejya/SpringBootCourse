package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext classBean = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach bean = (CricketCoach) classBean.getBean("myCricketCoach");
      System.out.println(bean.getDailyFortune());		
	}

}
