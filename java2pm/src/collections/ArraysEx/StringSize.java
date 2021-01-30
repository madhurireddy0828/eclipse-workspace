package collections.ArraysEx;

import java.util.Scanner;

public class StringSize {
	public static void main(String[] args) {
        // 1. input size
		System.out.println("Enter the size of String array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		// 2. declare the array with size
		String [] myArray = new String[size];
		

		// 3. input the numbers
		for(int i=0; i<size ; i++) {
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



