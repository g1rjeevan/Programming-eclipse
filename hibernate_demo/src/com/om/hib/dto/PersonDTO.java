package com.om.hib.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_table")
public class PersonDTO implements Serializable {

	// pk
	@Id
	@Column(name = "p_id")
	private int pid;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_gender")
	private char gender;
	@Column(name = "p_bg")
	private String bloodGroup;// generate set and get

	public PersonDTO() {

	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

}
