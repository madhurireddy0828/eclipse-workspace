package Scopes2;

import Scopes1.Info1;

public class Info3 {

	public void show(){
		//access everything within class
		Info1 i = new Info1();
		System.out.println(i.id);
		//System.out.println(i.name); // private cannot be accessed outside the class.
		//System.out.println(i.age); // protected cannot be accessed outside the pkg
		//System.out.println(i.count); // default cannot be accessed outside the pkg
	}
	
}




