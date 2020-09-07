package com.adellapo.sellersearcher.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Andres
 * @see <a href="https://github.com/adellapo/seller-searcher-app/" target="_blank">Github Repo</a>
 * @version 1.0
 * @since Sep 7, 2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

	private String id;
	@JsonProperty(value = "site_id")
	private String siteId; // se usó JsonProperty para matchear el campo y respetar convención CamelCase
	private String title;
	@JsonProperty(value = "category_id")
	private String categoryId;
	@JsonIgnore
	private String categoryName;

	public Result() {
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
	 * @return the siteId
	 */
	public String getSiteId() {
		return siteId;
	}

	/**
	 * @param siteId the siteId to set
	 */
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", siteId=" + siteId + ", title=" + title + ", categoryId=" + categoryId + "]";
	}

}
