package annotations.autowire2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = { "annotations.autowire2" })

public class ApplicationConfiguration {

}
