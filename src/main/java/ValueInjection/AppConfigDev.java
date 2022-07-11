package ValueInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Dev")
public class AppConfigDev {

	@Bean
	public Prices getPrices() {
		
		Prices prices =new Prices();
		prices.setName("ink");
		prices.setValue1(200);
		return prices;
		
	}
	
}
