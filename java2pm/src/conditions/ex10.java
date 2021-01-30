package conditions;

import java.util.Scanner;

public class ex10 {
	
 public static void main(String[] args) {
	

		//take two no. as  input and find small no.
		
		Scanner sc = new Scanner(System.in);//sc is a point of contact for console
		
		System.out.println("enter num1:");
		double n1 = sc.nextDouble();
		
		System.out.println("enter num2:");
		double n2 = sc.nextDouble();
		
		if(n1 < n2) {
		 System.out.println("small =" + n1);
		}else {
	     System.out.println("small =" + n2);
			 
		}
}


}



