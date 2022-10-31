package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CSK")
public class Csk {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerid;
	private String playername;
	private String jersycolor;
	private String skill;
	private int runs;
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public Csk(int playerid, String playername, String jersycolor, String skill, int runs, int matches, int hundreds,
			int fifties, int noOfNotouts, int jersyno) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.jersycolor = jersycolor;
		this.skill = skill;
		this.runs = runs;
		this.matches = matches;
		this.hundreds = hundreds;
		this.fifties = fifties;
		this.noOfNotouts = noOfNotouts;
		this.jersyno = jersyno;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getJersycolor() {
		return jersycolor;
	}
	public void setJersycolor(String jersycolor) {
		this.jersycolor = jersycolor;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getHundreds() {
		return hundreds;
	}
	public void setHundreds(int hundreds) {
		this.hundreds = hundreds;
	}
	public int getFifties() {
		return fifties;
	}
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	public int getNoOfNotouts() {
		return noOfNotouts;
	}
	public void setNoOfNotouts(int noOfNotouts) {
		this.noOfNotouts = noOfNotouts;
	}
	public int getJersyno() {
		return jersyno;
	}
	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}
	private int matches;
	private int hundreds;
	private int fifties;
	private int noOfNotouts;
	private int jersyno;
	

}
