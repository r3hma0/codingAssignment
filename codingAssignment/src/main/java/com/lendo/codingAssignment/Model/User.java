package com.lendo.codingAssignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String email;
	private String genders;
	private String status;
	
	public User(int id, String name, String email, String genders, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.genders = genders;
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
	public String getGenders() {
		return genders;
	}
	public void setGenders(String genders) {
		this.genders = genders;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", genders=" + genders + ", status=" + status
				+ "]";
	}
}
