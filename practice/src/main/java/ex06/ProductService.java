package ex06;

public class ProductService {

	AccountService accountService;

	public ProductService(AccountService accountService) {
		super();
		this.accountService = accountService;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void saveProduct() {
		System.out.println("Entering to saveProduct method, ProductService");
		accountService.save();
		System.out.println("Product Saved");
	}
}
