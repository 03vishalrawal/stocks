package com.greatminds.stocks.stocksservice.pojo;

import java.math.BigDecimal;

public class Quote {

	private String quote;
	
	private BigDecimal price;

	public Quote(String quote, BigDecimal price) {
		super();
		this.quote = quote;
		this.price = price;
	}
	
	public Quote() {
		// TODO Auto-generated constructor stub
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}
