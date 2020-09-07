package com.adellapo.sellersearcher.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author Andres
 * @see <a href="https://github.com/adellapo/seller-searcher-app/" target="_blank">Github Repo</a>
 * @version 1.0
 * @since Sep 7, 2020
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
