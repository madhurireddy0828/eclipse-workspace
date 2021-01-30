package collections.ArraysEx;

import java.util.Scanner;

public class TestStringWithInput {
	
	public static void main(String[] args) {
		        // 1. input size
				System.out.println("Enter the length of String array");
				Scanner sc = new Scanner(System.in);
				int length = sc.nextInt();

				// 2. declare the array with size
				String [] myArray = new String[length];
				

				// 3. input the numbers
				for(int i=0; i<length ; i++) {
				System.out.println("enter the "+(i+1+" String :"));
			    String len=sc.next();
			    myArray[i]=len;
				}
			    
				// display integers
				System.out.println("**********print all elements****************");
				for(String d :myArray ) {
				System.out.println(d);
				}
				}
				}



