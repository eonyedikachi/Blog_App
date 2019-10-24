package com.blog.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.app.post.Post;
import com.blog.app.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@RequestMapping("/posts")
	public List<Post> getAllPosts()
	{
		return postService.getAllPosts();
	}
	
	
	@RequestMapping("/posts/{id}")  
	public Post getPost(@PathVariable String id) {
		return postService.getPost(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/posts")
	//@PostMapping("/posts")
	public void addPost(@RequestBody Post post) {
		 
		postService.addPost(post);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
	//@PutMapping("/posts")
	public void updatePost(@RequestBody Post post, @PathVariable String id) {
		 
		postService.updatePost(id, post);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
	//@PutMapping("/posts")
	public void deletePost( @PathVariable String id) {
		 
		postService.deletePost(id);
		
	}
}
