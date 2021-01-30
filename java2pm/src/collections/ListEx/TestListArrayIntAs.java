package collections.ListEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestListArrayIntAs {
	//Take size as input.
	//Take the numbers for size numbers of times.
	//Store each number inside the ArrayList.
	//print all the numbers.
	
	public static void main(String[] args) {

	//Take size as input size
	System.out.println("Enter the size");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();

	//Declare the array with size

	int [] numbers = new int[size];

	//Take the numbers for size number of times

	for(int i=0; i< size ; i++) {
	System.out.println("Enter number : "+ (i+1));
	int num = sc.nextInt();
	numbers[i] = num;
	}
	//Store each number in the ArrayList

	List<Integer> nums = new ArrayList<Integer>();

	//print all the numbers

	System.out.println("******print all nums**********");
	for(int n : nums) {
	System.out.println(n);
	}
	}

}
