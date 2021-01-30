package collections.ListEx;
//create LinkedList for Integers
//store nums inside the LinkedList
//print the LinkedList

import java.util.LinkedList;
import java.util.List;

public class TestIntegerLinkedList {
	
	public static void main(String[] args) {
		//1.Create ArrayList for integer
		List<Integer> nums = new LinkedList<Integer>();
		
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



