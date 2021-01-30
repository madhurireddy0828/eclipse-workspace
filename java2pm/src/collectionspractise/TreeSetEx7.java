package collectionspractise;

import java.util.TreeSet;

public class TreeSetEx7 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
        t.add(new StringBuffer("A")); 
		t.add(new StringBuffer("B")); 
		t.add(new StringBuffer("C")); 
		t.add(new StringBuffer("D")); 
		t.add(new StringBuffer("a")); 
        t.add(new StringBuffer("c"));
		//t.add(null);
		// t.add("A");
		System.out.println(t);//ClassCastException
	}


}
