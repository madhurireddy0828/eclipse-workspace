package annotations.resource2;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller("myController")
public class ProductController {

	@Resource(name = "myService")
	ProductService service;

	public void process() {
		System.out.println("Entering to ProductController.process method");
		service.validate();
		System.out.println("Exit from ProductController.process method");
	}

}