package com.java.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class IplModel
{
@Id
@Column
private  int teamid;

private  String teamName;
public int getTeamid() {
	return teamid;
}
public void setTeamid(int teamid) {
	this.teamid = teamid;
}

public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public String getJersyClor() {
	return jersyClor;
}
public void setJersyClor(String jersyClor) {
	this.jersyClor = jersyClor;
}
public String getCaptianName() {
	return captianName;
}
public void setCaptianName(String captianName) {
	this.captianName = captianName;
}
public String getWisecaptianName() {
	return wisecaptianName;
}
public void setWisecaptianName(String wisecaptianName) {
	this.wisecaptianName = wisecaptianName;
}
public int getNoOfMatchesPlayed() {
	return noOfMatchesPlayed;
}
public void setNoOfMatchesPlayed(int noOfMatchesPlayed) {
	this.noOfMatchesPlayed = noOfMatchesPlayed;
}
public int getNoOfMatchesWon() {
	return noOfMatchesWon;
}
public void setNoOfMatchesWon(int noOfMatchesWon) {
	this.noOfMatchesWon = noOfMatchesWon;
}
private  String jersyClor;
public IplModel(int teamid,  String teamName, String jersyClor, String captianName, String wisecaptianName,
		int noOfMatchesPlayed, int noOfMatchesWon) {
	super();
	this.teamid = teamid;
	this.teamName = teamName;
	this.jersyClor = jersyClor;
	this.captianName = captianName;
	this.wisecaptianName = wisecaptianName;
	this.noOfMatchesPlayed = noOfMatchesPlayed;
	this.noOfMatchesWon = noOfMatchesWon;
}
@Column
private String captianName;
@Column
private  String wisecaptianName;
@Column

private  int noOfMatchesPlayed;
@Column

private  int noOfMatchesWon;
public IplModel() {
	super();
	// TODO Auto-generated constructor stub
}

}