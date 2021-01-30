package conditions;

import java.util.Scanner;

public class ex7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int n1 = sc.nextInt();
		
		System.out.println("enter 2nd number");
		int n2 = sc.nextInt();
		
		System.out.println("enter 3rd number");
		int n3 = sc.nextInt();
		
		if(n1<=n2 && n1<=n3) {
			System.out.println("small =" + n1);
		}
		
		else if(n2<=n1 && n2<=n3) {
			System.out.println("small =" + n2);
		}
		
		else {
			System.out.println("small =" + n3);
		}
			
			
	}

}
