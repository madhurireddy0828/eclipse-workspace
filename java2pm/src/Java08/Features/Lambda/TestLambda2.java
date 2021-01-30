package Java08.Features.Lambda;

public class TestLambda2 {

//Req:
//call the process method and Print HI
//call the process method and Print hello
//call the process method and Print welcome


public static void main(String[] args) {

Service1 s1 = () -> {
System.out.println("Hi");
};
s1.process();

Service1 s2 = () ->{
System.out.println("Hello");
};
s2.process();

Service1 s3 = () -> {
System.out.println("Welcome");
};
s3.process();
}
}


