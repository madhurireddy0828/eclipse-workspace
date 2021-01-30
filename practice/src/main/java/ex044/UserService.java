package ex044;

public class UserService {
	private String userName;
	private String password;

	public UserService(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public void process() {
		System.out.println("processing user using:: " + userName);
	}

}
