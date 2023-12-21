package com.lendo.codingAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendo.codingAssignment.Model.Posts;

public interface PostsRepository extends JpaRepository<Posts, Integer> {

}
