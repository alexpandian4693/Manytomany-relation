package com.java.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.IplModel;
import com.java.service.Iplservice;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@RestController
public class IplController 
{
	public static final Log LOG = LogFactory.getLog(IplController.class);
	
	

@Autowired
Iplservice iplservice;

@GetMapping(path="/team", consumes=MediaType.APPLICATION_XML_VALUE)
private List<IplModel> getAllTeams() 
{	
	LOG.info("getAllTeams method start");
	
return iplservice.getAllTeams();
}
@GetMapping(path="/ipl/{teamid}", consumes=MediaType.APPLICATION_XML_VALUE)
private IplModel getteams(@PathVariable("teamid") int teamid) 

{
	LOG.info("getteams method start");
	
return iplservice.getTeamsById(teamid);

}
@DeleteMapping(path="/team/{teamid}", consumes=MediaType.APPLICATION_XML_VALUE)
private void deleteTeam(@PathVariable("teamid") int teamid) 
{
	LOG.info("deleteTeam method start");
	iplservice.delete(teamid);
}
@PostMapping(path="/teams", consumes=MediaType.APPLICATION_XML_VALUE)

private int saveTeam(@RequestBody IplModel teams) 
{
	LOG.info("saveTeam method start");
	iplservice.saveOrUpdate(teams);
	LOG.info(teams.getTeamid());
return teams.getTeamid();
}
//creating put mapping that updates the book detail 
@PutMapping(path="/teams", consumes=MediaType.APPLICATION_XML_VALUE)
private IplModel update(@RequestBody IplModel teams) 
{
	iplservice.saveOrUpdate(teams);
return teams;
}
}
