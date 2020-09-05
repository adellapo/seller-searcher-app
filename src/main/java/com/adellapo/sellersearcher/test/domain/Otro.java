/**
 * 
 */
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
public class Otro {

	private String type;
	private Value value;

	public Otro() {
		super();
	}

	public Otro(String type, Value value) {
		super();
		this.type = type;
		this.value = value;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the value
	 */
	public Value getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Otro [type=" + type + ", value=" + value + "]";
	}

}
