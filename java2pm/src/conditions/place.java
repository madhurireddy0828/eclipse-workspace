package conditions;

import java.util.Scanner;

public class place {
	
	 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
				System.out.println("enter cityname");
				String cityname= sc.nextLine();
			    System.out.println("entered cityname"+cityname);
			    
			   if(cityname.equals("hyd")|| cityname.equals("chennai") || cityname.equals( "banglore" )|| cityname.equals("mumbai")) {
					System.out.println("service is provided");
				}
				 
				 else {
					 System.out.println("service is not provided");
				 }
				 
				 
					
					
			}
		
}


