package methods;

public class TestOperations9 {
	
	public static void main(String[] args) {
		
		
		// call the small() method inside the Opeartions
		//step 1 : create the Object for Opeartions
		
		Operations op = new Operations();
		
		//step2 : call the method using the object
		
		int s1 = op.small(20, 30);
		System.out.println(s1);
		
		int s2 = op.small(45,17);
		System.out.println(s2);
		
	}
}



