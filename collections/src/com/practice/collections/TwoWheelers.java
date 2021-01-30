package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoWheelers {
	public static void main(String[] args) {

		List<String> bikes = new ArrayList<>();

		bikes.add("pulsur");
		bikes.add("passion");
		bikes.add("splender");
		bikes.add("avenger");
		bikes.add("gixxer");
		bikes.add("ktm");
		System.out.println(bikes);

		List<String> scooties = new ArrayList<String>();
		scooties.add("activa");
		scooties.add("pept");
		scooties.add("jupiter");
		scooties.add("access");
		scooties.add("fasino");
		scooties.add("duet");
		System.out.println(scooties);

		Collections.shuffle(bikes);
		System.out.println("\n" + bikes);
		Collections.shuffle(scooties);
		System.out.println("\n" + scooties);

		System.out.println("\nafter copy");
		Collections.copy(bikes, scooties);
		System.out.println(scooties);
		System.out.println(bikes);

	}

}
