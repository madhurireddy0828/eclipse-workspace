package loops;

import java.util.Scanner;

public class disoddapp1 { 
	//take no,as input print all odd no. till input
	
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		for(int i=1; i<=size; i = i+2){
				System.out.println(i);
		}
	}

}
