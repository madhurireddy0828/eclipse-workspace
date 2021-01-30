package ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductServiceWithSprings {
	public static void main(String[] args) {

		Product product = new Product();
		product.setId("123456");
		product.setBrand("nike");
		product.setName("shoe");
		product.setSize("09 inch");
		product.setDisc("10%");

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/ex02/springs.xml");

		ProductService ps1 = (ProductService) context.getBean("pService");
		ps1.save(product);
	}

}
