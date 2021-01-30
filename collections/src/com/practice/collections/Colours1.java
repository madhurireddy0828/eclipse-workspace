package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colours1 {
	public static void main(String[] args) {
		// Creating list Object
		List<String> colours = new ArrayList<>();
//		adding colours to the list object
		colours.add("Violate");
		colours.add("Black");
		colours.add("Brown");
		colours.add("White");
		colours.add("Cyan Blue");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Gray");
		colours.add("Marooon");
		colours.add("Red");
//		printing colours
		System.out.println(colours);
		System.out.println();
		for (String strings : colours) {
			System.out.println(strings);
		}
		System.out.println();
//		adding colours by using index as per requirement
		colours.add(0, "Yellow");
		colours.add(8, "Pink");
		colours.add(12, "Purple");
		colours.add(10, "Orange");
//		printing colours
		System.out.println(colours);
		System.out.println();
		for (String string : colours) {
			System.out.println(string);
		}

//		retrieving elements by using index number.

		System.out.println("\nretrieving elements by using index number");
		System.out.println(colours.get(8));
		System.out.println(colours.get(13));
		System.out.println(colours.get(0));

//		retrieving list size
		System.out.println(colours.size());

//		replacing the colours by using index place

		colours.set(8, "mazanta");
		colours.set(11, "salmon");
		System.out.println(colours.get(8));
		System.out.println(colours);

		colours.remove(3);
		colours.remove(4);
		colours.remove(5);
		colours.remove(6);
		System.out.println(colours);

		if (colours.contains("salmon")) {
			System.out.println("colour available");
		} else {
			System.out.println("colour not available");
		}
		System.out.println("before sort: " + colours);
		Collections.sort(colours);
		System.out.println("after sort: " + colours);
	}
}
