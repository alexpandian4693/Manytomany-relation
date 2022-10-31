package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Csk;

@Repository

public interface JpaRepo extends JpaRepository<Csk, Integer>{

}
