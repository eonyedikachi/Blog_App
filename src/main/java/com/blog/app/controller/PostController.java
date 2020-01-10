package com.blog.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.app.pojo.PostPojo;
import com.blog.app.post.Post;
import com.blog.app.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	//View all Post on Blog site
	@RequestMapping("/posts")
	public List<Post> getAllPosts()
	{
		return postService.getAllPosts();
	}
	
	
	@RequestMapping("/posts/{id}")  
	public Optional<Post> getPost(@PathVariable int id) {
			return postService.getPost(id);
		 }
	
	
	
	// User creates a new post
	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	//@PostMapping("/posts")
	public void addPost(@RequestBody PostPojo post) {
		
		postService.addPost(post);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	//@PutMapping("/posts")
	public void updatePost(@RequestBody Post post, @PathVariable int id) {
		 
		postService.updatePost(id, post);
		
	}
	
	// Delete a Bog Post
	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	//@PutMapping("/posts")
	public void deletePost( @PathVariable int id) {
		 
		postService.deletePost(id);
		
	}
}
