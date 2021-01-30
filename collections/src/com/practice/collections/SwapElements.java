package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapElements {
	public static void main(String[] args) {

		List<String> cars = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		int i = 0;
		while (i < size) {
			System.out.print("Enter Car Name: ");
			String name = sc.next();
			cars.add(name);
			i++;
		}
		sc.close();
//		System.out.println(cars.get(2));
//		System.out.println(cars.get(3));
//
////		System.out.println("before swap: " + cars);
//		for (String list1 : cars) {
//			System.out.println(list1);
//		}
//
//		Collections.swap(cars, 2, 3);
////		System.out.println("after swap: " + cars);
//		for (String list2 : cars) {
//			System.out.println(list2);
//		}
		System.out.println(cars);
		Collections.reverse(cars);
		System.out.println(cars);

	}

}
