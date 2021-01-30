package Java08.Features.Lambda;

public class TestLambda1 {
//() =====> the input args
// before the "->" is the input args for the method to override
// after the "->" is the logic for the method to override

public static void main(String[] args) {

//using anonymous inner class
Service1 s= new Service1() {
@Override
public void process() {
System.out.println("Hi");
}
}; //create child class + override method + create obj
s.process();


//using lambda expression
Service1 s1= () -> { System.out.println("Hi"); };
//create child class + override method + create obj

// before the "->" is the input args for the process() method.
// after the "->" is the logic for the process() method.

s1.process();
}
}


