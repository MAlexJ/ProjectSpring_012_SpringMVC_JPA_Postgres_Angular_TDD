package configuration;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;

@Profile("test")
@Configuration
@Import(JPAConfigTest.class)
@ComponentScan(basePackages = {"com.malex"})
public class AppConfigTest {
    @Bean
    public PropertyPlaceholderConfigurer propertyConfigurer() {
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setLocations(new ClassPathResource("db.properties"),
                new ClassPathResource("hibernate.properties"),
                new ClassPathResource("dbcp.properties"));
        return configurer;
    }
}
