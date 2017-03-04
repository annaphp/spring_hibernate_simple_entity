package config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import repo.QuoteRepository;


@Configuration
@Import(PersistenceConfig.class)
public class AppConfig {
	
	@Bean
	public QuoteRepository quoteRepository(SessionFactory sessionFactory){
		return new QuoteRepository(sessionFactory);
	}
	
}
