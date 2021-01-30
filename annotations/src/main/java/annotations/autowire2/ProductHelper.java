package annotations.autowire2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductHelper {

	ProductDAO dao; // obj as instance variable

	@Autowired
	public ProductHelper(ProductDAO dao) {
		super();
		this.dao = dao;
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	public void check() {
		System.out.println("Entering to ProductHelper check method");
		dao.save();
		System.out.println("Exit from ProductHelper check method");
	}

}