package Java08.Features.Lambda;

public class TestController {
	public static void main(String[] args) {
	Controller c1 = (name) -> { System.out.println("Hello "+ name); }; // no mention of class , no mention process method
	c1.access("Ram");

	Controller c2 = (name) -> { System.out.println("Hi "+ name); };
	c2.access("Rahul");

	Controller c3 = (name) -> { System.out.println("Welcome "+ name); };
	c3.access("Raj");

	}

}
