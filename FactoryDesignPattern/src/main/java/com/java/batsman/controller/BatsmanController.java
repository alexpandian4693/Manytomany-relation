package com.java.batsman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.java.batsman.Batsman;
import com.java.batsman.BatsmanFactoryImplementation;


@RestController
public class BatsmanController {


	@GetMapping("/Batsman/{Batsman-type}")
	public String getVehicleTypeInfo(@PathVariable("Batsman-type") String batsman) throws Exception {

		Batsman BatsmanFactory = BatsmanFactoryImplementation.createInstance(batsman);
		return BatsmanFactory.specification();

	}

}
