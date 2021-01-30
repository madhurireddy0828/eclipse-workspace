package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
	Student stu =context.getBean("student" , Student.class);//bean id , class
	stu.displayStudentInfo();
	
	Student student =context.getBean("sowmya" , Student.class);
	student.displayStudentInfo();
	
	//Student st = context.getBean("madhu" , Student.class);
	//st.displayStudentInfo();
	  
}

}
