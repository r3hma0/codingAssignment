package com.lendo.codingLendoAssignment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lendo.codingLendoAssignment.Entity.Comments;
import com.lendo.codingLendoAssignment.Entity.Posts;
import com.lendo.codingLendoAssignment.Entity.Users;
import com.lendo.codingLendoAssignment.Repository.CommentsRepository;
import com.lendo.codingLendoAssignment.Repository.PostsRepository;
import com.lendo.codingLendoAssignment.Repository.UserRepository;

@Service
public class LendoService {
	
	private final UserRepository userRepository;
	private final PostsRepository postRepository;
	private final CommentsRepository commentsRepository;
	
	public LendoService(UserRepository userRepository, PostsRepository postRepository,
			CommentsRepository commentsRepository) {
		super();
		this.userRepository = userRepository;
		this.postRepository = postRepository;
		this.commentsRepository = commentsRepository;
	}
	
	private static final List<Users> users = new ArrayList<>();
	private static final List<Posts> posts = new ArrayList<>();
	private static final List<Comments> comments = new ArrayList<>();
	
	static
	{
		users.add(new Users(1,"Abdul Rahman Hussain","arahmanhussain@234.com","Male","active"));
		users.add(new Users(2,"Mohammed Hussain","mohammedhussain@789.com","Male","inactive"));
		users.add(new Users(1,"Mohammed Ismail","ismail@890.com","Male","active"));
		users.add(new Users(1,"Zeeshan","zeeshan@110.com","Male","inactive"));
		
	}
	
	static
	{
		posts.add(new Posts(101,2001,"Software Developer","I am a Software Developer"));
		posts.add(new Posts(102,2002,"Application Developer","I am a Application Developer"));
		posts.add(new Posts(103,2003,"Software Tester","I am a Software Tester"));
		posts.add(new Posts(104,2004,"QA","I am a QA"));
	}
	
	static
	{
		comments.add(new Comments(101,1101,"Abdul Rahman Husain","arahmanhussain@234.com","I am a Software Developer"));
		comments.add(new Comments(101,1101,"Mohammed Hussain","mohammedhussain@789.com","I am a Application Developer"));
		comments.add(new Comments(101,1101,"Mohammed Ismail","ismail@890.com","I am a Software Tester"));
		comments.add(new Comments(101,1101,"Zeeshan","zeeshan@110.com","I am a QA"));
		
	}


	
	public List<Users> getAllUsers() {
		 List<Users> allUsers = userRepository.findAll();
		 allUsers.addAll(users);
		 return allUsers;
	}
	
	public List<Comments> getComments()
	{
		List<Comments> allComments = commentsRepository.findAll();
		allComments.addAll(comments);
		return allComments;
	}
	
	public List<Posts> getPosts()
	{
		List<Posts> allPosts = postRepository.findAll();
		allPosts.addAll(posts);
		return allPosts;
	}
	
	public Users getProduct(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("user " + id + " not found"));
    }

	

}
