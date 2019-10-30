package com.blog.app.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.app.post.Post;
import com.blog.app.repo.PostRepo;

@Service
public class PostService {
	
	@Autowired
	private PostRepo postRepo;
	

	
	public List<Post> getAllPosts()
	{
		
		List<Post> posts = new ArrayList<>();
		postRepo.findAll().forEach(posts::add);
		return posts;
	}
	
	public void getPost(int id) {
	
		postRepo.getOne(id);
	}

	public void addPost(Post post) {
		postRepo.save(post);
		
	}

	public void updatePost(int id, Post post) {
		
		postRepo.save(post);
		
	}

	public void deletePost(int id) {
		postRepo.deleteById(id);
	}
	
	public void getPostsByUserId(int id) {
		postRepo.getPostsByUserId(id);
	}
	
}
	
