package com.lendo.codingAssignment.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendo.codingAssignment.Model.Comments;
import com.lendo.codingAssignment.Model.Posts;
import com.lendo.codingAssignment.Model.User;
import com.lendo.codingAssignment.Service.LendoService;

@RestController
public class LendoController {
	
	private LendoService lendoService;
	
	public LendoController(LendoService lendoService) {
		super();
		this.lendoService = lendoService;
	}
   
	@GetMapping("/users")
	public List<User> users()
	{
		return lendoService.findingUsers();
	}
	
	@GetMapping("/posts")
	public List<Posts> posts()
	{
		return lendoService.findingPosts();
	}
	
	@GetMapping("/comments")
	public List<Comments> comments()
	{
		return lendoService.findingComments();
	}



	
}


