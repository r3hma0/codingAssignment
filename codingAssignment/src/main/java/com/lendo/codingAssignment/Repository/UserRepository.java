package com.lendo.codingAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendo.codingAssignment.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
