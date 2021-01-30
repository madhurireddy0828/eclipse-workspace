package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Square {
	public static void main(String[] args) {

		List<Double> nums = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			System.out.print("Enter the Numbers: ");
			nums.add(sc.nextDouble());
			i++;
		}
		sc.close();

		List<Double> nums2 = new ArrayList<Double>();
		int j = 0;
		while (j < n) {
			double b = Math.sqrt(nums.get(j));
			nums2.add(b);
			j++;
		}
		
		System.out.println("square root of given numbers: " + nums2);
		Collections.sort(nums2);
		System.out.println("square root of given numbers: " + nums2);
		Collections.reverse(nums2);
		System.out.println("square root of given numbers: " + nums2);

	}
}
