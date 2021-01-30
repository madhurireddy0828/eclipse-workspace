 package conditions;

import java.util.Scanner;

public class valid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id=sc.nextInt();
		if(id>0) {
			System.out.println("valid id");
			System.out.println("enter the age");
			int age=sc.nextInt();
			if(age>18) {
				
				System.out.println("valid age");
				System.out.println("enter the usertype");
				String usertypes=sc.next();
				
				
				if(usertypes.equals("admin")){
					System.out.println("valid admin");
				}else {
						System.out.println("invalid admin");
					}
			}else 
					System.out.println("invalid age");
			}
		else {
			System.out.println("invalid id");
			
			
		}
	}
}
	



	
		
		
		
		
	


