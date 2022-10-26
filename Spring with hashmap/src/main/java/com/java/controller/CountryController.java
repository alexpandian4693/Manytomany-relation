package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Country;
import com.java.service.CountryService;

@RestController

public class CountryController {
	@Autowired(required = false)
	CountryService countryService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/getcountries")
	public List getcountries() {
		return countryService.getAllCountries();
		
	}
	@GetMapping("/getcountries/{id}")
	public Country getcountrybyId(@PathVariable(value="Id")int id) {
		return countryService.getCountryById(id);	
		
	}
	@GetMapping("/getcountries/{countryname}")
	public Country getcountrybyName(@RequestParam(value="name")String countryname) {
		return countryService.getCountryByName(countryname);	
		
	}
	@PostMapping("/addcountry")
	public Country addcountry(@RequestBody Country country) {
		return countryService.addnew(country);	
		
		
	}
	@PostMapping("/updatecountry")
	public Country updatecountry(@RequestBody Country country) {
		return countryService.update(country);		
		
	}
	@DeleteMapping("/getcountries/{id}")
	public Addresponse deletecountrybyId(@PathVariable(value="Id")int id) {
		return countryService.deleteCountryById(id);	
		
	}
	
	


}
