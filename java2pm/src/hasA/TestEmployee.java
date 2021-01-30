package hasA;

public class TestEmployee {
	
	public static void main(String[] args) {
		//create addres sobj
		Address currAddress = new Address("xxxx road", "bangalore", "KA", "in", 24242);
		Address perAddress = new Address("yyyy road", "hyderabad", "TS", "in", 24243);
		Address officAddress = new Address("zzzz road", "delhi", "MA", "in", 24241);
		
		//create employee obj with data
		
 
        Employee e = new Employee(2000, "kumar", 6, 90, currAddress, perAddress, officAddress);
        
       //print employee info
		e.showEmployeeInfo();
		
		//print address info

		currAddress.showAddress();
		perAddress.showAddress();
		officAddress.showAddress();
		
	}
	
	

}
