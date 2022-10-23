package com.java.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
