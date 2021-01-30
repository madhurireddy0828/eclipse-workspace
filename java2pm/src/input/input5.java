package input;

import java.util.Scanner;

public class input5 {
	
public static void main(String[] args) {
	//take two no. as input and perform add sub mul and div

		//take two no. as input
		
		//step1: create scanner object
		Scanner sc = new Scanner(System.in);//sc is a point of contact for console
		
		System.out.println("enter num1:");
		int n1 = sc.nextInt();
		
		System.out.println("enter num2:");
		int n2 = sc.nextInt();
		
		//perform operations
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		
		System.out.println("sum =" +sum);
		System.out.println("sub =" +sub);
		System.out.println("mul =" +mul);
		System.out.println("div =" +div);
		
}

}
		
		
		
		
		


