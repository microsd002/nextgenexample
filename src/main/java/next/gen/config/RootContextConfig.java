package next.gen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

@Configuration
//@ComponentScan({ "com.connectflexi.frontend.security","com.connectflexi.frontend.service", "com.connectflexi.frontend.provider" })
public class RootContextConfig {

	@Bean
	public PropertySourcesPlaceholderConfigurer propertyConfig() {
		String extPropertiesLocation = System.getProperty("application.properties.path");
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		propertySourcesPlaceholderConfigurer.setLocation(extPropertiesLocation != null ? new PathResource(extPropertiesLocation) : new ClassPathResource("application.properties") );
		return propertySourcesPlaceholderConfigurer;
	}
		
}
