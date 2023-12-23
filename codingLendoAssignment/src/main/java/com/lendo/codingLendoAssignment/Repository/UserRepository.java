package com.lendo.codingLendoAssignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lendo.codingLendoAssignment.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>
{


}
