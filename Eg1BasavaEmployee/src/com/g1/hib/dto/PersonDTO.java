package com.g1.hib.dto;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;

@Entity
@Table(name="person")
public class PersonDTO implements Serializable {
	public PersonDTO() {
	}
	@Id
	@GenericGenerator(name="personGen",strategy="increment")
	@GeneratedValue(generator = "personGen")
	@Column(name="p_id")
	private int pid;
	@Column(name="p_name")
	private String name;
	@Column(name="p_gender")
	private String gender;
	@Column(name="p_bg")
	private String bloodgroup;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	

	
}
