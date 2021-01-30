package collectionspractise;

import java.util.Comparator;
public class MyComparator implements Comparator {
@Override
	public int compare(Object o1, Object o2) {
		/*
		 * Integer i1 = (Integer) o1; //ex8
		 * Integer i2 = (Integer) o2; 
		 * if (i1 < i2) 
		 *   return +1;
		 * else if (i1 > i2) 
		 *   return -1; 
		 * else 
		 *   return 0;
		 */
	
		/*
		 * String s1 = o1.toString();//ex9 
		 * String s2 = (String)o2; 
		 *   return s2.compareTo(s1);
		 * //return -s1.compareTo(s2);
		 */	
	
        String s1 = o1.toString();//ex10
        String s2 = o2.toString();
        int i1 = s1.length();
        int i2 = s2.length();
        if(i1<i2)
        	return -1;
        else if(i1>i2)
        	return +1;
        else
        	return s1.compareTo(s2);
        
	}

	
}
