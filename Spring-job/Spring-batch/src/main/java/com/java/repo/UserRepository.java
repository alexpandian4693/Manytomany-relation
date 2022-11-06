package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Player;

public interface UserRepository extends JpaRepository<Player, Integer> {
}
