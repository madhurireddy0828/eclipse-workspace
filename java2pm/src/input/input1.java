package input;

import java.util.Scanner;

public class input1 {
	//take the input from console
	
	public static void main(String[] args) {
		
		//take input from customer and print the value
		
		//step1: create scanner object
		Scanner sc = new Scanner(System.in);//sc is a point of contact for console
		
		System.out.println("enter a number:");
		int x = sc.nextInt();// store input inside the variable x
		System.out.println("your input is :" +x);
		
	}
	
	

}
