package reflections;

public class Ex1 {
public static void main(String args[]) throws ClassNotFoundException {
				Class c1 = Class.forName("reflections.Person");
				System.out.println(c1.getName());
				
				Class c2 = Class.forName("reflections.Student");
				System.out.println(c2.getName());
				
			}
		}



