package com.lendo.codingAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendo.codingAssignment.Model.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
