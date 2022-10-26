package com.java.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.controller.Addresponse;
import com.java.model.Country;

@Service

public class CountryService {
	
	static HashMap<Integer, Country> countryIdMap;
	
	public CountryService(){
		countryIdMap=new HashMap<Integer, Country>();
		Country indiancountry= new Country(1,"india","delhi");
		Country uscountry= new Country(2,"usa","Washington");
		Country ukcountry= new Country(3,"uk","london");
		
		countryIdMap.put(1, indiancountry);
		countryIdMap.put(2, uscountry);
		countryIdMap.put(3, ukcountry);
		
	}
	
	public List getAllCountries() {
		@SuppressWarnings({ "unchecked" })
		List countries=new ArrayList(countryIdMap.values());
		return countries;
		
	}
	public Country getCountryById(int id) {
		Country country=	countryIdMap.get(id);
		return country;
		
	}
	public Country getCountryByName(String countryname) {
		Country country=null;
		for(int i:countryIdMap.keySet()) {
			if(countryIdMap.get(i).getCountryname().equals(countryname));
			
		}
		return country;
		
	}
	public Country addnew(Country country) {
		country.setId(getMaxId());
		countryIdMap.put(country.getId(), country);
		return country;
		
		
		
	}
	public static int getMaxId() {
		int max=0;
		for(int id:countryIdMap.keySet())
			if (max<=id)
				max=id;
		return max+1;
		
	}
	@RequestMapping("/country")
	public Country update(Country country) {
		if(country.getId()>0)
		countryIdMap.put(country.getId(), country);
		return country;
		
		
		
	}
	public Addresponse deleteCountryById(int id) {
		countryIdMap.remove(id);
		Addresponse res= new Addresponse();
		res.setMsg("Country deleted");
		res.setId(id);
		return res;
		
		
	}

}
