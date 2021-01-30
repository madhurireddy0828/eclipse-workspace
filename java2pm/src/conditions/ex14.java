package conditions;

import java.util.Scanner;

public class ex14 {
	
	public static void main(String[] args) {
		
		
		//take two no. as  input and find small no.
		
		Scanner sc = new Scanner(System.in);//sc is a point of contact for console
		
		System.out.println("enter num1:");
		long n1 = sc.nextLong();
		
		System.out.println("enter num2:");
		long n2 = sc.nextLong();
		
		if(n1 > n2) {
		 System.out.println("big =" + n1);
		}else {
	     System.out.println("big =" + n2);
			 
		}
}


}
