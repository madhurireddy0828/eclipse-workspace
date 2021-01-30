package conditions;

import java.util.Scanner;

public class usndpw {
	
	public static void main(String[] args) {
		
		//take user name ans password as input
		//if user value is admin and password is admin print login succesfully
		//if not print login failure
	
		Scanner sc = new Scanner(System.in);
		System.out.println("username");
		String username = sc.next();
		System.out.println("password");
		String password = sc.next();
		
		if(username.equals("admin") && password.equals("admin")){
			
			System.out.println("longin success");
		}else {
			System.out.println("login failure");
		}
	}
	

}
