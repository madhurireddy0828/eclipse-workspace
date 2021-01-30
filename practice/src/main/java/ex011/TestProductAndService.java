package ex011;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductAndService {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex011/springs.xml");

		ProductService ps1 = (ProductService) context.getBean("pService");
		UserService us1 = (UserService) context.getBean("uService");

//		if (ps1 == us1) {
//			System.out.println("both are same");
//		} else {
//			System.out.println("both are different");
//		}
		ps1.getAll();
		us1.process();

	}
}
