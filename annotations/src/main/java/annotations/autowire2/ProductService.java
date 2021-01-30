package annotations.autowire2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	ProductHelper helper;// helper obj as instance variable

	@Autowired
	public ProductService(ProductHelper helper) {
		super();
		this.helper = helper;
	}

	public void validate() {
		System.out.println("Entering to ProductService.validate method");
		helper.check();
		System.out.println("Exit from ProductService.validate method");
	}

}
