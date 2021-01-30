package ex06;

public class UserService {

	String userName;
	AccountService accountService;

	public UserService(String userName, AccountService accountService) {
		super();
		this.userName = userName;
		this.accountService = accountService;
	}

	public void userSaver() {
		System.out.println("Entering to userSaver method, UserService");
		accountService.save();
		System.out.println("User Saved");
	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public AccountService getAccountService() {
//		return accountService;
//	}

}
