package com.om.hib.relations.dto.onetoone;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "captain_table")
public class CaptainDTO {

	@Id
	@GenericGenerator(name = "incr", strategy = "increment")
	@GeneratedValue(generator = "incr")
	@Column(name = "c_id")
	private int cid;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_matches")
	private int noOfMatches;
	@Column(name = "c_nation")
	private String nation;
	@Column(name = "c_gender")
	private char gender;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="t_id")
	private TeamDTO teamDTO;

	public int getCid() {

		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public TeamDTO getTeamDTO() {
		return teamDTO;
	}

	public void setTeamDTO(TeamDTO teamDTO) {
		this.teamDTO = teamDTO;
	}

}
