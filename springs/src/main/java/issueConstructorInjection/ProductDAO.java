package issueConstructorInjection;

public class ProductDAO {

	private String dbName;

	public ProductDAO(String dbName) {
		super();
		this.dbName = dbName;
	}

	public String getDbName() {
		return dbName;
	}

	public void save() {
		System.out.println("Entering to ProductDAO save method");
		System.out.println("Data saved in " + dbName);
		System.out.println("Exit ProductDAO save method");
	}
}
