package com.lendo.codingLendoAssignment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Posts {
	
	@Id
	private Integer id;
	private Integer user_id;
	private String title;
	private String body;
	
	public Posts()
	{
		
	}
	
	public Posts(int id, int user_id, String title, String body) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.title = title;
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Posts [id=" + id + ", user_id=" + user_id + ", title=" + title + ", body=" + body + "]";
	}

}
