package conditions;

import java.util.Scanner;

   
    //take id,age,usertype as input.
	//perform validation
	//if id is positive then print valid id else pint invalid id
	//if age is gt 18 then print valid age else print valid id else print invalid id
    //if user type is positive then print valid id else print invalid id

	  public class EX6 {
			
			public static void main(String[] args) {
				
				//take id (int), age(int), userType(str) as input.
			   Scanner sc = new Scanner(System.in);
			   
			   System.out.println("enter id");
			   int id = sc.nextInt();
			   
			   System.out.println("enter age");
			   int age = sc.nextInt();
			   
			   System.out.println("enter usertype");
			   String userType = sc.next();
	
			// if d is positive then print valid id else print invalid id
			if(id > 0) {
				 System.out.println("valid id");
			}else {
				System.out.println("invalid id");
			}
			//if age is gt 18 then print valid age else print valid id else print invalid id
		
			if(age > 18) {
				 System.out.println("valid age");
			}else {
				System.out.println("invalid age");
			}
			
			//if user type is positive then print valid id else print invalid id

			if(userType.equals("admin")) {
				 System.out.println("valid userType");
			}else {
				System.out.println("invalid userType");
			}
}
	  }
