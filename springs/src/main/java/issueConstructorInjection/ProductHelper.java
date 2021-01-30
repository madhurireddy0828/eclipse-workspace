package issueConstructorInjection;

public class ProductHelper {

	ProductDAO dao; // obj as instance variable

	public ProductHelper(ProductDAO dao) {
		super();
		this.dao = dao;
	}

	public void check() {
		System.out.println("Entering ProductHelper check method");
		dao.save();
		System.out.println("Exit ProductHelper check method");
	}

}