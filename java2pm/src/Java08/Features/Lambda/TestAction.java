package Java08.Features.Lambda;

public class TestAction {
	public static void main(String[] args) {
		Action A1 = (name) -> {System.out.println("Hello" + name );
		return name;};
		A1. process("Raj");
	
		Action A2 = (name) -> { System.out.println("Hi "+ name); 
		return name;};
		A2.process("Rahul");

		
		Action A3 = (name) -> {System.out.println("Bye" + name);
		return name;};
		A3.process("Riya");
	}

}
