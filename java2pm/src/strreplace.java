import java.util.Scanner;

public class strreplace {
	
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		
		String name = sc.nextLine();
		
		
		//find length of string
		
		int size = name.length();
		System.out.println("size = "+size);
		
		//check str is starting with hi
		boolean c1 = name.startsWith("hi");
		System.out.println(" startswith hi is: "+c1);
		
		//check tr is ending with bye
		boolean c2 = name.endsWith("bye");
		System.out.println("ends with : "+c2);
		
		//replace old word with new
		String changed = name.replaceAll("kumar",  "shyam");
		System.out.println("before replace ::"+name);
		System.out.println("after replace "+changed);
}
}

		
		
	
	
	



	
	


