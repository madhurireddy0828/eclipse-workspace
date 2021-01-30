package com.di.obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
		Student student = context.getBean("stu",Student.class);
		student.cheating();
		
		AnotherStudent anotherstudent = context.getBean("AnotherStudent",AnotherStudent.class);
		anotherstudent.startcheating();
	}

}
