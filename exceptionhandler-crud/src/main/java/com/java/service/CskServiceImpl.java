package com.java.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.java.model.Csk;
import com.java.repo.JpaRepo;



public class CskServiceImpl implements CskService {
	@Autowired JpaRepo jparepo;

	@Override
	public Csk savePlayer(Csk csk) {
		
		return jparepo.save(csk);
	}
	

	@Override
	public Csk updatePlayer(Csk csk, int playerid)
    {
		Csk cskDB
            = jparepo.findById(playerid)
                  .get();
 
        if (Objects.nonNull(csk.getPlayername())
            && !"".equalsIgnoreCase(
            		csk.getPlayername())) {
        	cskDB.setPlayername(
            		csk.getPlayername());
        }
        else {
        	throw new IllegalStateException();
        }
 
        
 
        if (Objects.nonNull(
        		csk.getSkill())
            && !"".equalsIgnoreCase(
            		csk.getSkill())) {
        	cskDB.setSkill(
        			csk.getSkill());
        }
        else {
        	throw new IllegalArgumentException();
        }
 
       
 
        return jparepo.save(cskDB);
    }
	

	@Override
	public void deleteplayerById(int playerid) {
		// TODO Auto-generated method stub
		
		jparepo.deleteById(playerid);
		
		
	}
	@Override
    public List<Csk> fetchPlayerList() {

      
		
        return jparepo.findAll();
        
    }
	
	
	@ExceptionHandler(value = { IllegalStateException.class})
	protected ResponseEntity<Object> handleException(IllegalStateException e) {
		return new ResponseEntity<Object>("illegal state exception in controller",  HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Object> handleException(IllegalArgumentException e){
		
		return new ResponseEntity<Object>("illegal arg exception in controller", HttpStatus.BAD_REQUEST);
	}


	
}
