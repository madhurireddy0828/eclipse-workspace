package ex03;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ID: ");
		String id = sc.next();

		System.out.print("Enter the NAME: ");
		String name = sc.next();

		System.out.print("Enter the AGE: ");
		String age = sc.next();

		System.out.print("Enter the MOBILE: ");
		String mobile = sc.next();

		sc.close();
		User user = new User(id, name, age, mobile);

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex03/springs.xml");
		UserService us = (UserService) context.getBean("uService");
		us.saveUser(user);
	}
}
