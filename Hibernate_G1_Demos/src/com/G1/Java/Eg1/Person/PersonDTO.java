package com.G1.Java.Eg1.Person;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Person_practice_Table")
public class PersonDTO implements Serializable{
	
	//PK
	@Id
	@GenericGenerator(name="IDGen",strategy="increment")
	@GeneratedValue(generator=("IDGen"))
	@Column(name="p_Id")
	private int pId;
	@Column(name="p_Name")
	private String pName;
	@Column(name="p_Gender")
	private	char pGender;
	@Column(name="p_BloodGroup")
	private	String pBloodGroup;
	@Column(name="p_Age")
	private int pAge;
	@Column(name="p_Status")
	private String pStatus;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public char getpGender() {
		return pGender;
	}
	public void setpGender(char pGender) {
		this.pGender = pGender;
	}
	public String getpBloodGroup() {
		return pBloodGroup;
	}
	public void setpBloodGroup(String pBloodGroup) {
		this.pBloodGroup = pBloodGroup;
	}
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public String getpStatus() {
		return pStatus;
	}
	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}



}
