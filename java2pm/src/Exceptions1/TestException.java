package Exceptions1;

//converts string to int
//use Integer.parseInt() function.
// without exception handling
import java.util.Scanner;

   public class TestException {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("enter the age::");
          String age = sc.next();
           int ageInt = 0;
           ageInt = Integer.parseInt(age);
                  System.out.println("after conversion age int :: " + ageInt);
                  System.out.println("exit");

}

}