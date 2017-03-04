import model.Quote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import repo.QuoteRepository;
import config.AppConfig;



public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		
		
		Quote q = new Quote("Hello world", "John");
		QuoteRepository qr = context.getBean("quoteRepository", QuoteRepository.class);
		
		Long id = qr.save(q);
		Quote quote = qr.findQuoteById(id);
		System.out.println("SAVED: " + quote);
		
		quote.setAttributedTo("Nature");
		
		qr.update(quote);
		System.out.println("UPDATE: " + qr.findQuoteById(id));
   }
}