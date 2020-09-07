package com.adellapo.sellersearcher.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Andres
 * @see <a href="https://github.com/adellapo/seller-searcher-app/" target="_blank">Github Repo</a>
 * @version 1.0
 * @since Sep 7, 2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

	private String id;
	private String name;

	public Category() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

}
