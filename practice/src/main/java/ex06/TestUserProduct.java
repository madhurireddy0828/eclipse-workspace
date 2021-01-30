package ex06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserProduct {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex06/springs.xml");

		UserService us = (UserService) context.getBean("uService");
		ProductService ps = (ProductService) context.getBean("pService");
		us.userSaver();
		ps.saveProduct();
	}
}
