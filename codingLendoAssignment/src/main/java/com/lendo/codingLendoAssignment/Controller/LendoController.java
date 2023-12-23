package com.lendo.codingLendoAssignment.Controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lendo.codingLendoAssignment.Entity.Comments;
import com.lendo.codingLendoAssignment.Entity.Posts;
import com.lendo.codingLendoAssignment.Entity.Users;
import com.lendo.codingLendoAssignment.Service.LendoService;

@RestController
@RequestMapping("/v1")
public class LendoController {
   
	private final LendoService lendoService;
	
	public LendoController(LendoService lendoService) {
		super();
		this.lendoService = lendoService;
	}
	
	@GetMapping("/users")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Users> users()
	{
		return lendoService.getAllUsers();
	}
	
	@GetMapping("/posts")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Posts> posts()
	{
		return lendoService.getPosts();
	}
	
	@GetMapping("/comments")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Comments> comments()
	{
		return lendoService.getComments();
	}
	
	@GetMapping("/users/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public Users getOnlyOneUser(@PathVariable int id)
	{
		return lendoService.getProduct(id);
	}
}
