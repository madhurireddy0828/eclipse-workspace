package Enum;

public enum ColourType {
	

			BLUE,
			RED,
			BLACK,
			GREEN,
			WHITE,
			BROWN;
	        
	
	        public static boolean isValidColor(String input) {
				ColourType[] objs = ColourType.values();// get all objs
			
				boolean found= false;
				for(ColourType obj :objs) { // compare input with each color
					if(input.equals(obj.toString())) {
						found= true;
						break;
					}
				}
				return found;
			}
}
	  
	  
	
	  
			
		  
		


