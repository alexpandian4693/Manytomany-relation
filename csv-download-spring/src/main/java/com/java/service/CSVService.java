package com.java.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.csv.CSVHelper;
import com.java.model.Product;
import com.java.repo.Productrepo;

@Service
public class CSVService {

  @Autowired
  Productrepo repository;
  
  public ByteArrayInputStream load() {
    List<Product> products = repository.findAll();

    ByteArrayInputStream in = CSVHelper.ToCSV(products);
    return in;
  }
}
