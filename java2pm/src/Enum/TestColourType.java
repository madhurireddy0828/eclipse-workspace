package Enum;

public class TestColourType {
	
public static void main(String[] args) {
		//get obj for black
		ColourType c = ColourType.BLACK;
		System.out.println(c);
		
		
		//get obj for WHITE
		ColourType c1 = ColourType.WHITE;
		System.out.println(c1);
		

		System.out.println("***************Print all objs****************************");
		//get all objs
		ColourType[] objs = ColourType.values();// retuns all objs
		for(ColourType obj :objs) {
			System.out.println(obj);
		}
		
	}
}


