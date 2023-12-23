package com.lendo.codingLendoAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lendo.codingLendoAssignment.Entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
