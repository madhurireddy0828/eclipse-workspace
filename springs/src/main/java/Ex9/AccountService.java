package Ex9;

/**
 * Req: AccountService has "dbName" as dependency. UserService has "userName"
 * and "pass" as dependencies.
 * 
 * Create obj for AccountService and call connect() and save() methods. Create
 * obj for UserService and call process() method.
 */

public class AccountService {

	private String dbName;

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void connect() {
		System.out.println("connecting db with user:" + dbName);
	}

	public void save() {
		System.out.println("account- save using" + dbName);
	}
}
