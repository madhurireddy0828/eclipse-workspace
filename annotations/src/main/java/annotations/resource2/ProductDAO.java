package annotations.resource2;

import org.springframework.stereotype.Repository;

@Repository(value = "myDAO")
public class ProductDAO {

	public void save() {
		System.out.println("Entering to ProductDAO save method");
		System.out.println("Data saved... ");
		System.out.println("Exit from ProductDAO save method");
	}
}
