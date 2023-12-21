package com.lendo.codingAssignment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lendo.codingAssignment.Model.Comments;
import com.lendo.codingAssignment.Model.Posts;
import com.lendo.codingAssignment.Model.User;
import com.lendo.codingAssignment.Repository.CommentsRepository;
import com.lendo.codingAssignment.Repository.PostsRepository;
import com.lendo.codingAssignment.Repository.UserRepository;

@Service
public class LendoService {
	
	private final UserRepository userRepository;
	private final PostsRepository postsRepository;
	private final CommentsRepository commentsRepository;
	
	public LendoService(UserRepository userRepository, PostsRepository postsRepository,
		CommentsRepository commentsRepository) {
		this.userRepository = userRepository;
		this.postsRepository = postsRepository;
		this.commentsRepository = commentsRepository;
	}
	
	private static final List<User> users = new ArrayList<>();
	private static final List<Posts> posts = new ArrayList<>();
	private static final List<Comments> comments = new ArrayList<>();
	
	
	
	static
	{
		users.add(new User(1,"Abdul Rahman Hussain","arahmanhussain@gmail.com","Male","active"));
		users.add(new User(2,"Mohamed Hussain","mohammedhussain@gmail.com","Male","inactive"));
		users.add(new User(3,"Hassan","hassan@gmail.com","Male","active"));
		users.add(new User(4, "Bamba", "bamba@gmail.com","Female","active"));
	}
	
	static
	{
		posts.add(new Posts(101,2201,"Software Developer","I am Software Developer"));
		posts.add(new Posts(102,2202,"Software Management","I am Software Manager"));
		posts.add(new Posts(103,2203,"Scrum Master","I am Scrum Master"));
		posts.add(new Posts(104,2204,"Application Support Engineer","I am an Application Support Engineer"));
	}
	
	static
	{
		comments.add(new Comments(1011,11101,"Abdul Rahman Hussain","arahmanhussain@gmail.com","I am a Software Developer"));
		comments.add(new Comments(1011,11102,"Abdul Rahman Hussain","mohammedhussain@gmail.com","I am a Software Developer"));
		comments.add(new Comments(1011,11103,"Abdul Rahman Hussain","hassan@gmail.com","I am a Software Developer"));
		comments.add(new Comments(1011,11104,"Abdul Rahman Hussain","bamba@gmail.com","I am a Software Developer"));
	}
	
	
	
	
	public List<User> findingUsers() {
		 List<User> allUsers = userRepository.findAll();
		 allUsers.addAll(users);
		 return allUsers;
	}

	public List<Posts> findingPosts() {
		List<Posts> postUsers = postsRepository.findAll();
		postUsers.addAll(posts);
		return postUsers;
	}

	public List<Comments> findingComments() {
		List<Comments> commentUsers = commentsRepository.findAll();
		commentUsers.addAll(comments);
		return commentUsers;
	}
}
