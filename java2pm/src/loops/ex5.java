package loops;

import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
		
		//take size as input
		//print no.from 1 to input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		
		int size = sc.nextInt();
		for(int i=1; i<=size; i++) {
			System.out.println(i);
		}
		
	}

}
