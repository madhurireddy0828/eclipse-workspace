package collectionspractise;

import java.util.LinkedList;

public class LinkedListEx2 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("madhu");
		l.add("chinna");
		l.add("M");
		l.set(2, "uma");//replace
		l.add(1,"sowmya");
		l.addFirst("madhuri");
		
		System.out.println("The elements are :" + l);
		
				
	}

}
