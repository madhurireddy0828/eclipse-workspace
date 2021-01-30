package annotations.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegisterService {

	private RegisterDAO dao;

	@Autowired
	public RegisterService(RegisterDAO dao) {
		super();
		this.dao = dao;
	}

	public RegisterDAO getDao() {
		return dao;
	}

	public void setDao(RegisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public String toString() {
		return "RegisterService [dao=" + dao + "]";
	}

	public void process() {
		dao.save();
	}

}
