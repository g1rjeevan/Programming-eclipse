package com.om.hib.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="filedto_tb")
public class FileDTO {
	// add least 4 prop's
	@Id
	@GenericGenerator(name="incr",strategy="increment")
	@GeneratedValue(generator="incr")
	@Column
	private int fid;
	@Column(name="f_name")
	private String name;
	@Column
	private String location;
	@Column
	private int size;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
