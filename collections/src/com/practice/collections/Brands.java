package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Brands {
	public static void main(String[] args) {
		List<String> brands = new ArrayList<>();
		brands.add("uspolo");
		brands.add("pepe");
		brands.add("adidas");
		brands.add("puma");
		brands.add("nike");
		brands.add("levis");
		brands.add("redtape");

		Collections.sort(brands);
		System.out.println(brands);

		List<String> subString = brands.subList(3, 6);
		System.out.println(subString);

		Collections.reverse(brands);
		System.out.println(brands);

		Collections.shuffle(brands);
		System.out.println(brands);

	}
}
