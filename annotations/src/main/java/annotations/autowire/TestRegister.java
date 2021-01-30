package annotations.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestRegister {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		RegisterService rService = context.getBean(RegisterService.class);
		rService.process();

		RegisterDAO rDAO = context.getBean(RegisterDAO.class);
		rDAO.save();

	}
}
