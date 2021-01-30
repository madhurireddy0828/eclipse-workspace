import java.util.Scanner;

public class substring {
	
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
		
		//upper and lowr
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//substr: extracxt string from posi: 6 to posi: 10
		// satring position no starts from zero
		System.out.println(name.substring(6)); // prints from 7th till end
		System.out.println(name.substring(5, 9));
		
		
		
		
}
}



