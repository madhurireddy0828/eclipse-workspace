package collections.ListEx;

//create ArrayList for Integers
//store nums inside the ArrayList
//print the ArrayList

import java.util.ArrayList;
import java.util.List;

public class TestIntegerArrayList {
	public static void main(String[] args) {
		//1.Create ArrayList for integer
		List<Integer> nums = new ArrayList<Integer>();
		
		//2.add nums
		nums.add(10);
		nums.add(30);
		nums.add(45);
		nums.add(56);
		
		//3.Display numbers
		System.out.println("************print all numbers*********************");
		for(int n : nums) {
			System.out.println(n);
		}
		
	}

}
