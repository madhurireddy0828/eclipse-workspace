package ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductService {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex01/springs.xml");

		ProductService ps1 = (ProductService) context.getBean("pService");
		ps1.getAllProducts();

	}
}