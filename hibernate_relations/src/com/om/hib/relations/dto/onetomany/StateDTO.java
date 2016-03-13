package com.om.hib.relations.dto.onetomany;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "state_table")
public class StateDTO {

	@Id
	@GenericGenerator(name = "incr", strategy = "increment")
	@GeneratedValue(generator = "incr")
	@Column(name = "s_id")
	private int sid;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_lang")
	private String lang;
	@Column(name = "s_cm")
	private String cmName;

	// step1
	@OneToMany(cascade = CascadeType.ALL)
	// step 2
	@JoinColumn(name = "state_id")
	private Collection<DistrictDTO> districtDTOs;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	public String getCmName() {
		return cmName;
	}

	public void setCmName(String cmName) {
		this.cmName = cmName;
	}

	public Collection<DistrictDTO> getDistrictDTOs() {
		return districtDTOs;
	}

	public void setDistrictDTOs(Collection<DistrictDTO> districtDTOs) {
		this.districtDTOs = districtDTOs;
	}

}
