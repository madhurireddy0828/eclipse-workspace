package com.di.loadingfrompropertyfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
		Student student = context.getBean("student",Student.class);
		student.dispalyStudentInfo();
	}

}
