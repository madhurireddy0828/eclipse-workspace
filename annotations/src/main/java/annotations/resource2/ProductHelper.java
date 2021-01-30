package annotations.resource2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component(value = "myHelper")
public class ProductHelper {

	@Resource(name = "myDAO")
	ProductDAO dao; // obj as instance variable

	public void check() {
		System.out.println("Entering to ProductHelper check method");
		dao.save();
		System.out.println("Exit from ProductHelper check method");
	}

}