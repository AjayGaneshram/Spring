package Config_Basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Basic.Address;

@Configuration
public class ConfigClass {
	/*
	 * we are creating bean using manually and send it to IOC spring
	 */
	@Bean(name="addressnew")
public Address getadd() {
	return new Address();
}
	
}
