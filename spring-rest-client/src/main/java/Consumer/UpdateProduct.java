package Consumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpdateProduct {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IntegrationService service = applicationContext.getBean(IntegrationService.class);
		Product product = new Product();
		product.setArticleId(63);
		product.setTitle("3abccccc");
		product.setCategory("cameara1156789");

		String status = service.updateProduct(product);

		System.out.println(status);

	}
}