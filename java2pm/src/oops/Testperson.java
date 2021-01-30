package oops;

public class Testperson {
	
	public static void main(String[] args) {
		
		// create obj for persom
		//set the data
		//print the data
		
		
		//1.create the obj
		person p1 = new person();
		//p1 as seperate memory for id , name , age
		
 		//2.set the data
		p1.id=1000;
		p1.name="madhu";
		p1.age=23;
		
		//print the data
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		person p2 = new person();
		//p2 as seperate memory for id , name , age
		
		//2.set the data
		p2.id=1001;
		p2.name="chinna";
		p2.age=24;

		//print data
		System.out.println(p2.id);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
				
		
	}

}
