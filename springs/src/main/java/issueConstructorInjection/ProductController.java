package issueConstructorInjection;

public class ProductController {

	ProductService service;

	public ProductController(ProductService service) {
		super();
		this.service = service;
	}

	public void process() {
		System.out.println("Entering ProductController.process method");
		service.validate();
		System.out.println("Exit ProductController.process method");
	}

}