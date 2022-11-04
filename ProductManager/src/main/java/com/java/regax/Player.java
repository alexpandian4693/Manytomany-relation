package com.java.regax;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="player")
public class Player {
	@Id
	@GeneratedValue
	(strategy = GenerationType.IDENTITY)
	private int id;
	public Player(int id, String playername, String teamneam, String skill, float average, int noOfMatchesPlayed) {
		super();
		this.id = id;
		this.playername = playername;
		this.teamneam = teamneam;
		this.skill = skill;
		this.average = average;
		this.noOfMatchesPlayed = noOfMatchesPlayed;
	}
	@Column(name="playername")
	private String playername;
	@Column(name="teamneam")
	private String teamneam;
	public int getId() {
		return id;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getTeamneam() {
		return teamneam;
	}
	public void setTeamneam(String teamneam) {
		this.teamneam = teamneam;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public int getNoOfMatchesPlayed() {
		return noOfMatchesPlayed;
	}
	public void setNoOfMatchesPlayed(int noOfMatchesPlayed) {
		this.noOfMatchesPlayed = noOfMatchesPlayed;
	}
	@Column(name="skill")
	private String skill;
	@Column(name="average")
	private float average;
	@Column(name="noOfMatchesPlayed")
	private int noOfMatchesPlayed;

	

}
