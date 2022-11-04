package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Product;

public interface Productrepo extends JpaRepository <Product,Integer>
{

}
