package annotations.resource2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		ProductController pController = (ProductController) context.getBean("myController");
		pController.process();

		System.out.println();
		ProductController pController1 = context.getBean(ProductController.class);
		pController1.process();
	}

}
