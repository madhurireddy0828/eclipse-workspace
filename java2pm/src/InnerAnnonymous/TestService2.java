package InnerAnnonymous;
//Req:
//call process() method and print "Hello"
//call process() method and print "Bye"

public class TestService2 {
	public static void main(String[] args) {
		Service s = new Service()  {
			@Override
			public void process() {
				System.out.println("Hello");
				
			}
			
		};
//  creating child child + overriding the process method + creating obj
		s.process();
	
       Service s2 = new Service()  {
	        @Override
	       public void process() {
		        System.out.println("Bye");
		
	}
	
};
//creating child child + overriding the process method + creating obj
       s2.process();
    }
}