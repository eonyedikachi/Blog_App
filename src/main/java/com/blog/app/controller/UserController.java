package com.blog.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.app.user.User;
import com.blog.app.service.PostService;
import com.blog.app.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PostService postService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	
	@RequestMapping("/users/{id}")  
	public void getUser(@PathVariable int id) {
			userService.getUser(id);
		 }
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	//@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		 
		userService.createUser(user);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
	//@PutMapping("/users")
	public void updateUser(@RequestBody User user, @PathVariable int id) {
		 
		userService.updateUser(id, user);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
	//@PutMapping("/users")
	public void deleteUser( @PathVariable int id) {
		 
		userService.deleteUser(id);	
	}
	
	@RequestMapping("/users/posts/{id}")  
	public void getPostsByUser(@PathVariable int id) {
			postService.getPostsByUserId(id);
		 }
	
	
}
