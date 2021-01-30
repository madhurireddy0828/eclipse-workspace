package conditions;

import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		
		
		//take two no. as  input and find small no.
		
		Scanner sc = new Scanner(System.in);//sc is a point of contact for console
		
		System.out.println("enter num1:");
		int n1 = sc.nextInt();
		
		System.out.println("enter num2:");
		int n2 = sc.nextInt();
		
		if(n1 < n2) {
		 System.out.println("small =" + n1);
		}else {
	     System.out.println("small =" + n2);
			 
		}
}





}
