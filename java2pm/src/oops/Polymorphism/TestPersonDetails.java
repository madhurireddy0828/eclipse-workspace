package oops.Polymorphism;

public class TestPersonDetails {
	public static void main(String[] args) {
		
		PersonDetails p = new PersonDetails();
		p.id = 1000;
		p.name = "madhu";
		p.age = 45;
		p.street = "sai nagar";
		p.city = "nellore";
		p.state = "andhra pradesh";
		p.country = "india";
		p.pin = 123;
		
		StudentDetails s = new StudentDetails();
		s.id = 1001;
		s.fname = "madhurri";
		s.lname = "devi";
		s.semester = 1;
		s.street = "siva nagar";
		s.city = "ongole";
		s.state = "andhra pradesh";
		s.country = "india";
		s.pin = 321;
		
		EmployeeDetails e = new EmployeeDetails();
		e.id = 1002;
		e.fname = "madhuri";
		e.lname = "devii";
		e.pfno = 56;
		e.ppfno = 56;
		e.street1 = "vinayaka nagar";
		e.city1 = "kandukur";
		e.state1 = "andhra pradesh";
		e.country1 = "india";
		e.street2 = "vinayaka nagar";
		e.city2 = "kandukur";
		e.state2 = "andhra pradesh";
		e.country2 = "india";
		e.street3 = "sr nagar";
		e.city3 = "hyd";
		e.state3 = "telagana";
		e.country3 = "india";
		s.pin = 3214;
		
		DisplayAllData d = new DisplayAllData();
		d.displayPersonDetails(p);
		d.displayEmployeeDetails(e);
        d.displayStudentDetails(s);
	
		
		
		
	}

}
