package com.greatminds.stocks.dbservice.model;

import java.io.Serializable;
import java.util.List;

public class Quotes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7321391017387289329L;
	
	
	private String userName;
	private List<String> quotes;
	public Quotes() {
		// TODO Auto-generated constructor stub
	}
	
	public Quotes(String userName, List<String> quotes) {
		super();
		this.userName = userName;
		this.quotes = quotes;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getQuotes() {
		return quotes;
	}
	public void setQuotes(List<String> quotes) {
		this.quotes = quotes;
	}
}
