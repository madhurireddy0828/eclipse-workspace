package com.di.obj.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
		Human human = context.getBean("Human",Human.class);
		human.startpumping();
	}

}
