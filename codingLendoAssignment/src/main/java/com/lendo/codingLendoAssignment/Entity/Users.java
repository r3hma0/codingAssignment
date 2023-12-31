package com.lendo.codingLendoAssignment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	private Integer id;
	private String name;
	private String email;
	private String gender;
	private String status;
	
	public Users()
	{
		
	}
	
	
	public Users(int id, String name, String email, String gender, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.status = status;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", status=" + status
				+ "]";
	}
  
}
