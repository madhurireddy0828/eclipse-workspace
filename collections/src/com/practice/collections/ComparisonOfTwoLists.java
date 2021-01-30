package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ComparisonOfTwoLists {
	public static void main(String[] args) {
		List<String> c1 = new ArrayList<String>();
		c1.add("red");
		c1.add("green");
		c1.add("yellow");
		c1.add("brown");
		c1.add("orange");

		List<String> c2 = new ArrayList<String>();
		c2.add("red");
		c2.add("brown");
		c2.add("green");
		c2.add("pink");
		c2.add("White");
		c2.add("yellow");
		c2.add("blue");

		List<String> c3 = new ArrayList<String>();
		for (String compare : c2) {
			c3.add(c1.contains(compare) ? "yes" : "no");
		}
		System.out.println(c3);

	}

}
