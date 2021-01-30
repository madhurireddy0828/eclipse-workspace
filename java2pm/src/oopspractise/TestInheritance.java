package oopspractise;

public class TestInheritance {
	public static void main(String[] args) {
		Inheritance I = new Inheritance();
		Inheritance.m1();
		//Inheritance.m2();C.E
		
		C c = new C();
		c.m1();
		c.m2();
		
		Inheritance p = new Inheritance ();
		p.m1();
		//p.m2();C.E
		
	}

}
