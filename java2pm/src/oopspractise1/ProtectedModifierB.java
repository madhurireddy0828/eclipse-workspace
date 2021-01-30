package oopspractise1;

import oopspractise.ProtectedMoifierA;

public class ProtectedModifierB extends ProtectedMoifierA {
	  public static void main(String[] args) {
		
 ProtectedMoifierA a = new ProtectedMoifierA();
	// a.m1();
	 
	 ProtectedModifierB b = new ProtectedModifierB();
	 b.m1();
	 
	 ProtectedMoifierA a1 = new ProtectedModifierB();
	// a1.m1();
 }
 }

 