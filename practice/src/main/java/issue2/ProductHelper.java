package issue2;

public class ProductHelper {

	ProductDAO dao; // ProductDAO is the instance variable of ProductHelper

	public void check() {
		System.out.println("Entering to ProductHelper, check method");
		dao.save();
		System.out.println("Exit to ProductHelper, check method");
	}
}
