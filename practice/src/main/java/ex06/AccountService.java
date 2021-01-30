package ex06;

public class AccountService {
	private String dbName;

	public AccountService(String dbName) {
		super();
		this.dbName = dbName;
	}

//	public String getDbName() {
//		return dbName;
//	}

	public void save() {
		System.out.println("Entering save method.AccountService");
		System.out.println("save account:: " + dbName);
	}

}
