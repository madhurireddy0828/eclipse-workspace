package methods;

public class Operations {
	
		// method with no retun type and no input args
		public void show() {
		System.out.println("helloo welcome to show");
		System.out.println("bye.....");
		}
		
        //method with no return type and 1 input arg [String]
	    public void printName(String data) {
	    System.out.println("Mr/Mrs " + data);
	}
	
	  //method with no return type and 2 input arg [int, int]
	    public void sum(int x , int y) {
	    int z = x+y;
	    System.out.println("sum is :: "+z);
	    }
	    
	  //,method with a return value[string] and no input args
	 // one method can return only one value
	 //return statement is mandatory
	 public String getData() {
	 return "welcome to data";
	 }
	 
	//,method with a return value[string] and 1 input arg[String]
	 public String process(String name) {
	 return "My Dear "+name;
	 }
	 
	//,method with a return value[1] and 2 input arg[int]
	 public int big(int x , int y) {
		 if(x>y) {
			 return x;
		 }
		 else {
			 return y;
		 }
	 }

	 
	 public int small(int x , int y) {
	 if(x<y) {
		 return x;
	 }
	 else {
		 return y;
	 }
}
    
	//multiplication table
	 public void multiplication(int size) {
		 for(int i=1; i<=10; i++){
				int res = size*i;
				System.out.println(size +" * " + i + " = " +res);
			}
		 }
		
    //factorial
	 public int factorial(int n) {
		 int res = 1;
		 for(int i= 1; i<=n; i++) {
			 res = res*i;
		 }
		 return res;
	 }
}


	 

	

	
	  

	
	


