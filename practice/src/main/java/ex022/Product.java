package ex022;

public class Product {

	private String id;
	private String brand;
	private String type;
	private String size;
	private String price;
	private String disc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", type=" + type + ", size=" + size + ", price=" + price
				+ ", disc=" + disc + "]";
	}

}
