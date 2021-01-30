package ex05;

public class UserService {

	String userName;
	AccountService accountService;

	public UserService(String userName, AccountService accountService) {
		super();
		this.userName = userName;
		this.accountService = accountService;
	}

	public void saveUser() {
		System.out.println("inside saveUser method");
		System.out.println("save user:" + userName);
	}

	public String getUserName() {
		return userName;
	}

	public AccountService getAccountService() {
		return accountService;
	}
}
