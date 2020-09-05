package com.adellapo.sellersearcher.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Andres
 * @link https://www.github.com/adellapo/seller-searcher-app
 * @version 1.0
 * @since Sep 5, 2020
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Seller {

	private Long id;
	private String nickname;

	public Seller() {
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
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", nickname=" + nickname + "]";
	}

}
