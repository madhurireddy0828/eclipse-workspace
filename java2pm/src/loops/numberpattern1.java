package loops;

import java.util.Scanner;

public class numberpattern1 {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number of rows");
		
		int rows = sc.nextInt();
		
		System.out.println("your pattern");
		
		for(int i=1; i<=rows; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print(j+"");
			}
			
				
				System.out.println();
				
				sc.close();
				
				
				
			}
			
			
			
		}
		
		
	}


