package collections.SetEx;

//Req:
//Create a hashset for string 
//add strings to the hashset
//print the elements in the hashset

import java.util.HashSet;
import java.util.Set;


public class TestStringHashSet {
	
	public static void main(String[] args) {

		//create hashset for strings
		Set<String> names = new HashSet<String>();
		
		
		//add text in hashset
		names.add("java");
		names.add("sap");
		names.add("hana");
		names.add("apple");
		names.add("zebra");
		names.add("sap");
		names.add("veeru");
		names.add("dotnet");
		names.add("hana");
		names.add("java");
		names.add("sap");
		
		
		//print all
		System.out.println("Entered NAMES ARE :");
		for (String s: names) {
			System.out.println(s);
		}
		
		
	
	}
}



