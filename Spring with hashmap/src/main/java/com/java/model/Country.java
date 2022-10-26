package com.java.model;




public class Country {
	 
	private int id;
	 
	private String countryname;
		 
	private String countrycapital;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Country(int id, String countryname, String countrycapital) {
		super();
		this.id = id;
		this.countryname = countryname;
		this.countrycapital = countrycapital;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		this.countrycapital = countrycapital;
	}
	

}
