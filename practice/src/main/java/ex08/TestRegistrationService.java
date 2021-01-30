package ex08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRegistrationService {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex08/springs.xml");
		RegistrationService rs = (RegistrationService) context.getBean("rService");
		rs.process();
	}

}
