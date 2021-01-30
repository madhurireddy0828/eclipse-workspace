package annotations.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestRegister {

	public static void main(String args[]) {
		// get context object
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

//uisng context obj get the bean objs
		RegisterService registerService = context.getBean(RegisterService.class);

		registerService.process();

		RegisterDAO registerDAO = context.getBean(RegisterDAO.class);
		registerDAO.save();

	}

}