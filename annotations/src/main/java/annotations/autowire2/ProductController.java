package annotations.autowire2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

	ProductService service;

	@Autowired
	public ProductController(ProductService service) {
		super();
		this.service = service;
	}

	public void process() {
		System.out.println("Entering to ProductController.process method");
		service.validate();
		System.out.println("Exit from ProductController.process method");
	}

}