package ex022;

public class OutputWithoutSprings {

	public static void main(String[] args) {
		Product pro = new Product();
		pro.setId("123456");
		pro.setBrand("reebok");
		pro.setType("shoe");
		pro.setSize("9 inch");
		pro.setPrice("RS.4999");
		pro.setDisc("20%");

		ProductService ps = new ProductService();
		ps.save(pro);
	}

}
