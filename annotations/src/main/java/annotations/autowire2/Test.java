package annotations.autowire2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		ProductController pController = context.getBean(ProductController.class);
		pController.process();
	}

}
