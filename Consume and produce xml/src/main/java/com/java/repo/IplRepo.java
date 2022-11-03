package com.java.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.IplModel;



public interface IplRepo extends JpaRepository<IplModel, Integer>{

}
