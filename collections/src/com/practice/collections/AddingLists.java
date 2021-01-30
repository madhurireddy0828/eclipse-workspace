package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingLists {
	public static void main(String[] args) {
		List<String> vegetables = new ArrayList<>();
		vegetables.add("brinjal");
		vegetables.add("ladiesfinger");
		vegetables.add("drumsticks");
		vegetables.add("pumpkin");
		vegetables.add("carrot");
		vegetables.add("beatroot");
		vegetables.add("cabbage");
		vegetables.add("cucumber");

		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("promagranate");
		fruits.add("popaya");
		fruits.add("strawberry");
		fruits.add("kiwi");
		fruits.add("dragon");
		fruits.add("jack");

		System.out.println("");

		List<String> all = new ArrayList<String>();
		all.addAll(vegetables);
		all.addAll(fruits);

		System.out.println(all);

		Collections.sort(all);
		System.out.println(all);

		Collections.reverse(all);
		System.out.println(all);

	}

}
