package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
	public static void main(String[] args) {
		List<String> colour = new ArrayList<String>();
		colour.add("black");
		colour.add("green");
		colour.add("white");
		colour.add("blue");
		colour.add("red");
		colour.add("yellow");
		colour.add("orange");
		colour.add("pink");
		colour.add("purpule");
		System.out.println("Added colours are: " + colour);
		colour.remove(0);
		System.out.println(colour);

		if (colour.isEmpty() == false) {

			System.out.println(colour.size());
		} else {
			System.out.println("collection is empty");
		}

		colour.removeAll(colour);
		System.out.println(colour);
		if (colour.isEmpty() == false) {

			System.out.println(colour.size());
		} else {
			System.out.println("collection is empty");
		}
	}
}
