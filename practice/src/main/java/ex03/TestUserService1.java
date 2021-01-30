package ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService1 {
	public static void main(String[] args) {

//		User user = new User();
//		user.setId("12345");
//		user.setName("lokesh");
//		user.setAge("25");
//		user.setMobile("9966449023");

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex03/springs.xml");

		UserService us = (UserService) context.getBean("uService");
//		us.saveUser(user);
	}

}
