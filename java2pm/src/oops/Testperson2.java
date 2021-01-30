package oops;

import java.util.Scanner;

public class Testperson2 {
	
	public static void main(String[] args) {
		
		// take data as input and keep inside the object
		//print the data
		
		person p1 = new person();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		p1.id=sc.nextInt();
		
        System.out.println("enter name");
        p1.name=sc.next();
        
        System.out.println("enter age");
        p1.age=sc.nextInt();
		
		//print the data
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		
		
				
		
	}

}



