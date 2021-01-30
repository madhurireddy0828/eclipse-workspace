package com.MyPractice;

public class Customer {

	private String name;
	private Long phno;
	private String city;
	private String state;

//constructors 	
	public Customer(String name, Long phno, String city, String state) {
		super();
		this.name = name;
		this.phno = phno;
		this.city = city;
		this.state = state;
	}

//getters and setters 	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

//to string method	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phno=" + phno + ", city=" + city + ", state=" + state + "]";
	}

// hashcode	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phno == null) ? 0 : phno.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phno == null) {
			if (other.phno != null)
				return false;
		} else if (!phno.equals(other.phno))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

}
