package annotations.resource;

import org.springframework.stereotype.Component;

@Component(value = "myAppUtil")
public class ApplicationUtil {

	public void save() {
		System.out.println("applicationUtil save : ");
	}

}