package com.lendo.codingAssignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comments {
   
	@Id
	private int id;
	private int post_id;
	private String name;
	private String email;
	private String body;
	
	public Comments(int id, int post_id, String name, String email, String body) {
		super();
		this.id = id;
		this.post_id = post_id;
		this.name = name;
		this.email = email;
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", post_id=" + post_id + ", name=" + name + ", email=" + email + ", body=" + body
				+ "]";
	}
}
