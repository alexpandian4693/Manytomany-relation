package com.java.ipl.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.ipl.model.IplModel;
import com.java.ipl.service.Iplservice;



@RestController
public class IplController {
	@Autowired Iplservice iplser;
	Logger logger = LoggerFactory.getLogger(IplController.class);
	 @PostMapping(path="/saveplayer", produces= {"Iplteams/xml"}, consumes={"Iplteams/xml"})
	 public IplModel saveplayer(
	         @RequestBody IplModel iplmodel)
	 
	    {
		 logger.info(iplmodel.getCaptianName());
	        return iplser.savePlayer(iplmodel);
	    }

	    @GetMapping("/getAllplayers")
	    public List<IplModel> fetchPlayerList()
	    {
	        return iplser.fetchPlayerList();
	    }
	 

	    @PutMapping("/players/{id}")
	    public IplModel   updatePlayer(@RequestBody IplModel iplmodel,  @PathVariable("id") int teamid)
	    {
	        return iplser.updatePlayer(   iplmodel, teamid);
	    }
	 
	    // Delete operation
	    @DeleteMapping("/players/{id}")
	    public String deleteplayerById(@PathVariable("id")
	                                       int teamid)
	    {
	    	iplser.deleteplayerById(  teamid);
	        return "Deleted Successfully";
	    }

		
		
	}


