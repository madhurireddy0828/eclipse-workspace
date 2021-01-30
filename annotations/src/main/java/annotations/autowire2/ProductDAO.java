package annotations.autowire2;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	public void save() {
		System.out.println("Entering to ProductDAO save method");
		System.out.println("Data saved.");
		System.out.println("Exit from ProductDAO save method");
	}
}
