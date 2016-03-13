package com.om.hib.relations.dto.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "team_table")
public class TeamDTO {

	// can be int, short or long if increment or anytype
	@Id
	@GenericGenerator(name = "incr", strategy = "increment")
	@GeneratedValue(generator = "incr")
	@Column(name = "team_id")
	private int tid;
	@Column(name = "team_size")
	private int teamSize;
	@Column(name = "team_name")
	private String name;
	@Column(name = "team_country")
	private String country;
	// step 1
	@OneToOne(cascade = CascadeType.ALL)
	// step 2
	@PrimaryKeyJoinColumn
	private CaptainDTO captainDTO;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public CaptainDTO getCaptainDTO() {
		return captainDTO;
	}

	public void setCaptainDTO(CaptainDTO captainDTO) {
		this.captainDTO = captainDTO;
	}

}
