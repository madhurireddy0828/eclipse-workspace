package issue;

public class ProductController {

	ProductService service;

	public void process() {
		System.out.println("Entering ProductController, process method");
		service.validate();
		System.out.println("Exit ProductController, process method");
	}
}
