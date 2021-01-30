package com.MyPractice;

public class Student {

	private String roll;
	private String fname;
	private String lname;
	private String dep;
	private String sem;

// constructors

	public Student(String roll, String fname, String lname, String dep, String sem) {
		super();
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.dep = dep;
		this.sem = sem;
	}

//getters and setters
	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}

}
