package collections.ListEx;

//create Vector for Integers
//store nums inside the Vector
//print the Vector

import java.util.List;
import java.util.Vector;

public class TestIntegerVector {
	
	public static void main(String[] args) {
		//1.Create ArrayList for integer
		List<Integer> nums = new Vector<Integer>();
		
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
