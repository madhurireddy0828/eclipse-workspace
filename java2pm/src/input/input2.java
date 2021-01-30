package input;

import java.util.Scanner;

public class input2 {
	
public static void main(String[] args) {
		
		//take input from customer and print the value
		
		//step1: create scanner object
		Scanner sc = new Scanner(System.in);//sc is a point of contact for console
		
		System.out.println("enter a float:");
		float x = sc.nextFloat();
		System.out.println("your float input is :" +x);
		
		System.out.println("enter a long:");
		long y = sc.nextLong();
		System.out.println("your long input is :" +y);
		
		System.out.println("enter a double:");
		double z = sc.nextDouble();
		System.out.println("your double input is :" +z);
		
		
	}
	
	

}



