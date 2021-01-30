package ex044;

public class AccountService {

	private String dbName;

	public AccountService(String dbName) {
		super();
		this.dbName = dbName;
	}

	public void connect() {
		System.out.println("Connecting db with user:: " + dbName);
	}

	public void save() {
		System.out.println("account - save using:: " + dbName);
	}
}
