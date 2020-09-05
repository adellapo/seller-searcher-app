package com.adellapo.sellersearcher.test.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Andres
 * @link https://www.github.com/adellapo/seller-searcher-app
 * @version 1.0
 * @since Sep 5, 2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

	private Long id;
	private String quote;

	public Value() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the quote
	 */
	public String getQuote() {
		return quote;
	}

	/**
	 * @param quote the quote to set
	 */
	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		return "Value [id=" + id + ", quote=" + quote + "]";
	}

}