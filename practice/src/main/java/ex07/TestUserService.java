package ex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex07/springs.xml");
		UserService us = (UserService) context.getBean("uService");
		System.out.println(us.getUserName());
		System.out.println(us.getConfigs());
	}
}
