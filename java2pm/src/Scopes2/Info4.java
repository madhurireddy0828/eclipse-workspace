package Scopes2;

import Scopes1.Info1;

public class Info4 extends Info1 {

				public void show(){
					//access everything within class
					System.out.println(id);
					//System.out.println(name);/ private cannot be accessed outside the class.
					System.out.println(age); // can be accessed because Info4 is child class
					//System.out.println(count);  // default cannot be accessed outside the pkg
				}
				
			}


