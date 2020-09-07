package com.adellapo.sellersearcher.domain;

import java.util.ArrayList;

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
public class Search {

	@JsonProperty(value = "site_id") // se usó JsonProperty para matchear el campo y respetar convención CamelCase
	private String siteId;
	private Seller seller;
	private ArrayList<Result> results;

	public Search() {

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
	 * @return the seller
	 */
	public Seller getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	/**
	 * @return the results
	 */
	public ArrayList<Result> getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "Search [siteId=" + siteId + ", seller=" + seller + ", results=" + results + "]";
	}

}
