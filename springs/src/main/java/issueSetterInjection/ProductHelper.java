package issueSetterInjection;

public class ProductHelper {

	ProductDAO dao; // obj as instance variable

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	public void check() {
		System.out.println("Entering to ProductHelper, check method");
		dao.save();
		System.out.println("Exit from ProductHelper, check method");
	}

}