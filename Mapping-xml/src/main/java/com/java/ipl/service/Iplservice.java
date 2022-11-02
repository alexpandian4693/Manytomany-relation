package com.java.ipl.service;

import java.util.List;

import com.java.ipl.model.IplModel;

public interface Iplservice {
	
 IplModel savePlayer(IplModel iplmodel);
    
    List<IplModel> fetchPlayerList(); 
  
    IplModel updatePlayer(IplModel iplmodel, int teamid); 
    
   
    
    void deleteplayerById(int teamid);

}
