package collections.ListEx;

	
	//don't take size
	//enter the name 
	//store every name inside the ArrayList
	//if name value is "END" then stop taking the input
	//finally print all names


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	public class TestListArrayStringAs {

			public static void main(String[] args) {

				
				List<String> names = new ArrayList<String> ();
				while(true) {
					System.out.println("Enter the name");
					Scanner sc = new Scanner(System.in);
					String name = sc.next();
					if ("END".equals(name)) {
						break;

					}
					names.add(name);
					
				}
				System.out.println("**********print all elements****************");
				for(String d : names) {
				System.out.println(d);
			}
			}
	}
