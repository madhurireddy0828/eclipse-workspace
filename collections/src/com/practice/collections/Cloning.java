package com.practice.collections;

import java.util.ArrayList;

public class Cloning {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("lokesh");
		names.add("satya");
		names.add("hithesh");
		names.add("vishnu");
		names.add("sri");

		System.out.println(names);

		ArrayList<String> names1 = (ArrayList<String>) names.clone();
		System.out.println(names1);

	}
}
