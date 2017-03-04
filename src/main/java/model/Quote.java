package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quote {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	private String quote;
	private String attributedTo;

	public Quote() {
	}

	public Quote(String quote, String attributedTo) {
		this.quote = quote;
		this.attributedTo = attributedTo;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getAttributedTo() {
		return attributedTo;
	}

	public void setAttributedTo(String attributedTo) {
		this.attributedTo = attributedTo;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Quote [quote=" + quote + ", attributedTo=" + attributedTo + "]";
	}
	
	
	

}
