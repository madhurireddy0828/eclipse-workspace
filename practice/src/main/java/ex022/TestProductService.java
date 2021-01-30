package ex022;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductService {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId("258852");
		product.setBrand("pepe");
		product.setType("jean pant");
		product.setSize("30");
		product.setPrice("1999");
		product.setDisc("20%");

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex022/springs.xml");

		ProductService ps = (ProductService) context.getBean("pService");
		ps.save(product);

	}
}
