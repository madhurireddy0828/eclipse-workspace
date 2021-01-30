package ex02;

public class ProductServiceWithOutSprings {

	public static void main(String[] args) {

		Product product = new Product();

		product.setId("123456");
		product.setBrand("polo");
		product.setName("T-Shirt");
		product.setSize("40");
		product.setDisc("25%");

		ProductService ps = new ProductService();
		ps.save(product);
	}
}
