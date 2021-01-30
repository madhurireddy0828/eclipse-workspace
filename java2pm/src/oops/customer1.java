package oops;

import java.util.Scanner;

public class customer1 {
	
public static void main(String[] args) {
		
		// take data as input and keep inside the object
		//print the data
		
		Customer c1 = new Customer();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter fristname");
		c1.fristname=sc.next();
		
        System.out.println("enter lastname");
        c1.lastname=sc.next();
        
        System.out.println("enter mobile");
        c1.mobile=sc.next();
        
        System.out.println("enter email");
		c1.email=sc.next();
		
		System.out.println("enter city");
		c1.city=sc.next();
		
		//print the data
		System.out.println(c1.fristname);
		System.out.println(c1.lastname);
		System.out.println(c1.mobile);
		System.out.println(c1.email);
		System.out.println(c1.city);
		
		
		
		
				
		
	}

}



	
	


