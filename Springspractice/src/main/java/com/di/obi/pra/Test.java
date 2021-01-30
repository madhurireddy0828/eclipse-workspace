package com.di.obi.pra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
		College college = context.getBean("College",College.class);
		college.startedstuding();
	}

}
