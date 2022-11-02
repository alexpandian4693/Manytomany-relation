package com.java.ipl.service;

import java.util.List;

import com.java.ipl.model.IplModel;
import com.java.ipl.repo.IplRepo;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;




public class IplServiceImpl implements Iplservice {
	@Autowired IplRepo jparepo;

	@Override
	public IplModel savePlayer(IplModel iplmodel) {
		
		return jparepo.save(iplmodel);
	}
	

	@Override
	public IplModel updatePlayer(IplModel iplmodel, int teamid)
    {
		IplModel cskDB
            = jparepo.findById(teamid)
                  .get();
 
        if (Objects.nonNull(iplmodel.getTeamName())
            && !"".equalsIgnoreCase(
            		iplmodel.getTeamName())) {
        	cskDB.setTeamName(
        			iplmodel.getTeamName());
        }
        else {
        	throw new IllegalStateException();
        }
 
        
 
        if (Objects.nonNull(
        		iplmodel.getCaptianName())
            && !"".equalsIgnoreCase(
            		iplmodel.getCaptianName())) {
        	cskDB.setCaptianName(
        			iplmodel.getCaptianName());
        }
        else {
        	throw new IllegalArgumentException();
        }
 
       
 
        return jparepo.save(cskDB);
    }
	

	@Override
	public void deleteplayerById(int teamid) {
		// TODO Auto-generated method stub
		
		jparepo.deleteById(teamid);
		
		
	}
	@Override
    public List<IplModel> fetchPlayerList() {

      
		
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
