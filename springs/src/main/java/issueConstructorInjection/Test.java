package issueConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"file:src/main/java/issueConstructorInjection/springs.xml");

		ProductController pc = (ProductController) context.getBean("pController");
		pc.process();

	}

}
