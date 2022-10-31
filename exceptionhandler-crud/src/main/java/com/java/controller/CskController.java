package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Csk;
import com.java.service.CskService;



@RestController
public class CskController {
	
    @Autowired private CskService cskService;

    @PostMapping("/saveplayer")
    public Csk saveplayer(
         @RequestBody Csk csk)
    {
        return cskService.savePlayer(csk);
    }

    @GetMapping("/getAllplayers")
    public List<Csk> fetchPlayerList()
    {
        return cskService.fetchPlayerList();
    }
 

    @PutMapping("/players/{id}")
    public Csk   updatePlayer(@RequestBody Csk csk,  @PathVariable("id") int playerid)
    {
        return cskService.updatePlayer(   csk, playerid);
    }
 
    // Delete operation
    @DeleteMapping("/players/{id}")
    public String deleteplayerById(@PathVariable("id")
                                       int playerid)
    {
    	cskService.deleteplayerById(  playerid);
        return "Deleted Successfully";
    }

}
