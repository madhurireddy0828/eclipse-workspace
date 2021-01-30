package ex05;

public class AccountService {

	private String dbName;

	public AccountService(String dbName) {
		super();
		this.dbName = dbName;
	}

	public void save() {
		System.out.println("inside save method");
		System.out.println("account - save:::" + dbName);
	}

}
