package collectionspractise;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx9Reverse {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Madhu");
		t.add("Chinna");
		t.add("Uma");
		t.add("Suma");
		t.add("Nithya");
		System.out.println(t);
	}

}


