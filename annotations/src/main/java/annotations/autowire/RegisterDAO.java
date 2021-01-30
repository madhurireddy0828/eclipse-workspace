package annotations.autowire;

import org.springframework.stereotype.Component;

@Component
public class RegisterDAO {
	public void save() {
		System.out.println("saved");
	}

}
