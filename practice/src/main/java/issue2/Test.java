package issue2;

public class Test {
	public static void main(String[] args) {
		ProductController pc = new ProductController();
		ProductService ps = new ProductService();
		ProductHelper ph = new ProductHelper();
		ProductDAO pd = new ProductDAO();
		ph.dao = pd;
		ps.helper = ph;
		pc.service = ps;
		pc.process();

	}
}
