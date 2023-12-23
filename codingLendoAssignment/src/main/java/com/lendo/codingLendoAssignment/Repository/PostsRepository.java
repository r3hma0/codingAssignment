package com.lendo.codingLendoAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendo.codingLendoAssignment.Entity.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer>{

}
