package com.om.hib.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie_table")
public class MovieDTO {

	@Id
	@GenericGenerator(name = "moviePk", strategy = "increment")
	@GeneratedValue(generator = "moviePk")
	@Column(name = "m_id")
	private int id;
	@Column(name = "m_name")
	private String name;
	@Column(name = "m_lang")
	private String lang;
	@Column(name = "m_rating")
	private int rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
