package com.om.hib.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pub_table")
public class PubDTO {

	@Id
	@GenericGenerator(name = "pubGen", strategy = "increment")
	@GeneratedValue(generator = "pubGen")
	@Column(name = "p_primary")
	private int primary;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_location")
	private String location;
	@Column(name = "p_phone")
	private int phone;

	// private Date started;

	public int getPrimary() {
		return primary;
	}

	public void setPrimary(int primary) {
		this.primary = primary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	/*
	 * public Date getStarted() { return started; }
	 * 
	 * public void setStarted(Date started) { this.started = started; }
	 */

}
