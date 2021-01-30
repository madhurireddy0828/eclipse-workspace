package conditions;

import java.util.Scanner;

public class bank {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter bank name");
		String bankname = sc.nextLine();
		
		if(bankname.equals("sbi"))
			System.out.println("Roi=10%");
		
		else if(bankname.equals("icici"))
			System.out.println("Roi=11%");
		
		else if(bankname.equals("hdfc"))
			System.out.println("Roi=12%");
		
		else if(bankname.equals("citi"))
			System.out.println("Roi=13%");
		
		else
			System.out.println("invalid bank");
		
	}

}
