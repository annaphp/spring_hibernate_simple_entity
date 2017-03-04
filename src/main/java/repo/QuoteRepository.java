package repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Quote;

@Repository
@Transactional
public class QuoteRepository {
	
	private SessionFactory sessionFactory;
	
	public QuoteRepository(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}
	// proxy begins transaction and inits current session
	public Long save(Quote quote){
		Long id = (Long) currentSession().save(quote);
		return id;
	}
	
	public Quote findQuoteById(Long id){
		return (Quote) currentSession().get(Quote.class, id);
	}
	
	public void update(Quote quote){
		currentSession().update(quote);
	}
	
	public void delete(Quote quote){
		currentSession().delete(quote);
	}

}
