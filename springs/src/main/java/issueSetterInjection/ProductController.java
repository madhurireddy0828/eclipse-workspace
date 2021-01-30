package issueSetterInjection;

public class ProductController {

	ProductService service;

	public ProductService getService() {
		return service;
	}

	public void setService(ProductService service) {
		this.service = service;
	}

	public void process() {
		System.out.println("Entering to ProductController, process method");
		service.validate();
		System.out.println("Exit from ProductController, process method");
	}

}