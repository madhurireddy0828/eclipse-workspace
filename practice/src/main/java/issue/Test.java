package issue;

public class Test {
	public static void main(String[] args) {

		ProductController pc = new ProductController();

		ProductService ps = new ProductService();
		pc.service = ps;

		ProductHelper ph = new ProductHelper();
		ps.helper = ph;

		ProductDAO pd = new ProductDAO();
		ph.dao = pd;

		pc.process();

	}
}
