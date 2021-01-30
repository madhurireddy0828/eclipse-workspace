package issueConstructorInjection;

public class ProductService {

	ProductHelper helper;// helper obj as instance variable

	public ProductService(ProductHelper helper) {
		super();
		this.helper = helper;
	}

	public void validate() {
		System.out.println("Entering ProductService.validate method");
		helper.check();
		System.out.println("Exit ProductService.validate method");
	}

}
