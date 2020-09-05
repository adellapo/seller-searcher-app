/**
 * 
 */
package com.adellapo.sellersearcher.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value;

/**
 * 
 * @author Andres
 * @link www.github.com/adellapo/
 * @version
 * @since Sep 5, 2020
 */
public class Quote {

	private String type;
	private Value value;

	public Quote() {
		super();
	}

	public Quote(String type, Value value) {
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
		return "Quote [type=" + type + ", value=" + value + "]";
	}

}
