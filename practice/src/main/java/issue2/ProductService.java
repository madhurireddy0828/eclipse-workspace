package issue2;

public class ProductService {
	ProductHelper helper;

	public void validate() {
		System.out.println("Entering to ProductService, validate method");
		helper.check();
		System.out.println("Exit to ProductService, validate method");
	}

}
