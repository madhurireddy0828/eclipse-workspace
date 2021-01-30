package com.di.loadingfrompropertyfiles;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")//dynamic
	private String name;
	private String interestedcourse;
	private String hobby;
	//@Required
	//@Value("${student.name}")//dynamic
   // public void setName(String name) {
		//this.name = name;
	//}
	@Required
	@Value("oracle")//static
	public void setInterestedcourse(String interestedcourse) {
		this.interestedcourse = interestedcourse;
	}
	@Required
	@Value("shuttle")//static
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void dispalyStudentInfo() {
		System.out.println("student name" + name);
		System.out.println("student interestedcourse" + interestedcourse);
		System.out.println("student hobby" + hobby);
		
	}
	

}
