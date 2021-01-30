package loops;

import java.util.Scanner;

public class displayeven1 {
	//take no,as input print all even no. till input
	
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		for(int i=1; i<=size; i++){
			if(i%2==0)
				System.out.println(i);
		}
	}
	

}
