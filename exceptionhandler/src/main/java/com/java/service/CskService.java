package com.java.service;

import java.util.List;

import com.java.model.Csk;



public interface CskService {
	 
    Csk savePlayer(Csk csk);
    
    List<Csk> fetchPlayerList(); 
  
    Csk updatePlayer(Csk csk, int playerid); 
    
   
    
    void deleteplayerById(int playerid);

}
