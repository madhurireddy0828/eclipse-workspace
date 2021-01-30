package collections.ArraysEx;

public class SearchIntArray {
	
	public static void main(String[] args) {
	
	        int[] num = {1, 3, 5, 6, 8};
	        int toFind = 7;
	        

	        boolean found = false;

	        for (int n : num) {
	            if (n == toFind) {
	                found = true;
	             
	                 break;
	                }
	            }
	                
	        if(found)
	            System.out.println(toFind + " is found.");
	        else
	            System.out.println(toFind + " is not found.");
	    }
	}
		
	


