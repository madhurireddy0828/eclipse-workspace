package collectionspractise;

import java.util.*;

public class Demo{

   public static void main(String args[]) {
      Demo obj = new Demo();
      Vector v = new Vector(3, 2);
      System.out.println("Initial size: " + v.size());
      System.out.println("Initial capacity: " + v.capacity());
      v.addElement(new Integer(1));
      v.addElement(new String("krishna"));
      v.addElement(new Float(3.5f));
      v.addElement(obj);
      System.out.println("Capacity after four additions: " + v.capacity());
   }
}