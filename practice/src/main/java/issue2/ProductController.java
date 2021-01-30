package issue2;

public class ProductController {

	ProductService service;

	public void process() {
		System.out.println("Entering to ProductController, process method ");
		service.validate();
		System.out.println("Entering to ProductController, process method ");

	}
}
