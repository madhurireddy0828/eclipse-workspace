package issueSetterInjection;

public class ProductService {

	ProductHelper helper;// helper obj as instance variable

	public ProductHelper getHelper() {
		return helper;
	}

	public void setHelper(ProductHelper helper) {
		this.helper = helper;
	}

	public void validate() {
		System.out.println("Entering to ProductService, validate method");
		helper.check();
		System.out.println("Exit from ProductService, validate method");
	}

}
