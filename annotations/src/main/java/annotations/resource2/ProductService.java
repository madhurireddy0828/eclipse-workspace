package annotations.resource2;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("myService")
public class ProductService {

	@Resource(name = "myHelper")
	ProductHelper helper;// helper obj as instance variable

	public void validate() {
		System.out.println("Entering to ProductService.validate method");
		helper.check();
		System.out.println("Exit from ProductService.validate method");
	}
}
