package collections.MapsEx;

import java.util.HashMap;
import java.util.Map;


public class TestInterview1 {



/**
  
  128- user111
  133- user7
  131 - user44
  
 */

public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("128", "user1");
		map.put("133", "user7");

		// get the size
		System.out.println(map.size());
		
		map.put("128", "user111");   // dupliate KEY IS NOT ALLowed,
		                             // value is replaced
		                             // user1 is replaced with user111
		map.put("131", "user44");  
		
		//In Map Key is always unique; duplicate keys are not allowed.
		
		// get the size
		System.out.println(map.size());  // interview point
		
		System.out.println(map.get("128")) ;  // "user111"....interview point
	}


}



