package annotations.resource;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("myApp")
public class Applicationn {

	@Resource(name = "myAppUtil")
	private ApplicationUtil util;

	public void process() {
		System.out.println("Entering to Applicationn, process method");
		util.save();
	}
}
