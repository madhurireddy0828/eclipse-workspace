package StringsPractice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city name:");
		String name = sc.nextLine();
		if (name.equals("hyderabad"))
		{
		  System.out.println("Hello Hyderabad");
		}
		
		else if (name.equals("chennai"))
		{
		  System.out.println("Hello chennai");
		}
		
		else if (name.equals("banglore"))
		{
		  System.out.println("Hello banglore");
		  
		}
		else 
		  System.out.println("Enter the valid city name:");
	}

}
