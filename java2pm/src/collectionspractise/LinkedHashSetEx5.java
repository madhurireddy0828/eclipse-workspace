package collectionspractise;


import java.util.LinkedHashSet;

public class LinkedHashSetEx5 {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet(); 
		h.add("B");
		h.add("A");
		h.add("Z");
		h.add("E");
		h.add("L");
		System.out.println(h.add("Z"));
		System.out.println(h);
		
	}

}
