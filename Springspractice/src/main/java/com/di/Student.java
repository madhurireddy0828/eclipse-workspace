package com.di;

public class Student {
	
	private int id;
	private String studentName;
	
	/*
	 * public Student(int id) { this.id=id; }
	 * 
	 * public Student(int id, String studentName) { this.id = id; this.studentName =
	 * studentName; }
	 */
	//setter method
	  public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	//setter method end 

    public void displayStudentInfo()
	{
          System.out.println("student name is :" + studentName                                             
        		                 + " and student id is: " +id);
}

	}

