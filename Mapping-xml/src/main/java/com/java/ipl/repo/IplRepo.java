package com.java.ipl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java.ipl.model.IplModel;



public interface IplRepo extends JpaRepository<IplModel, Integer>{

}
