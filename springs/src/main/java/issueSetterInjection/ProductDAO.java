package issueSetterInjection;

public class ProductDAO {

	String dbName;

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void save() {
		System.out.println("Entering to ProductDAO save method");
		System.out.println("Data saved in " + dbName);

	}

}
