package com.java.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.java.model.IplModel;
import com.java.repo.IplRepo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Service
public class Iplservice 
{
	public static final Log LOG = LogFactory.getLog(Iplservice.class);
@Autowired
IplRepo iplrepo;
public List<IplModel> getAllTeams() 
{
List<IplModel> teams = new ArrayList<IplModel>();
iplrepo.findAll().forEach(team1 -> teams.add(team1));
return teams;
}
public IplModel getTeamsById(int teamid) {

	LOG.info("getTeamsById method start");
	LOG.info(iplrepo.findById(teamid).get());
return iplrepo.findById(teamid).get();
}
public void saveOrUpdate(IplModel teams) 
{
	
	
	iplrepo.save(teams);
}
public void delete(int id) 
{
	iplrepo.deleteById(id);
}
public void update(IplModel teams, int teamid) 
{
	iplrepo.save(teams);
}
}