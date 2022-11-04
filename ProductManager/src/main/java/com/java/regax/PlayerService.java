package com.java.regax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlayerService {

	@Autowired
	private PlayerRepository repo;
	
	public List<Player> listAll() {
		return repo.findAll();
	}
	
	public void save(Player player) {
		repo.save(player);
	}
	
	public Player get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
