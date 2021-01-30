package conditions;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		
		//take two strings as input and print whether two strings are equal or not
		
		Scanner sc = new Scanner(System.in);//sc is a point of contact for console
		
		System.out.println("enter String:");
		String str1= sc.next();
		
		System.out.println("enter String:");
		String str2 = sc.next();
		
		//dont use == for comparing two strings
		//use equals method for comparing two strings
		
         if(str1.equals(str2)) {
		 System.out.println("Strings are equal");
		}else {
	     System.out.println("Strings are not equal");
		}
	} 
}

	

