package InnerAnnonymous;

public class TestValidation {
	public static void main(String[] args) {
		Validation v = new Validation() {
			
			@Override
			public void validate() {
               System.out.println("Customer validation done");
				
			}
		};
		v. validate();
		
		Validation v2 = new Validation() {
			
			@Override
			public void validate() {
				System.out.println("Employee validation done");
				
			}
		};
		
		v2.validate();
	}
	

}
