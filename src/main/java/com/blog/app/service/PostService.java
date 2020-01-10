package com.blog.app.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.app.pojo.PostPojo;
import com.blog.app.post.Post;
import com.blog.app.repo.PostRepo;
import com.blog.app.repo.UserRepo;
import com.blog.app.user.User;

@Service
public class PostService {
	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private UserRepo userRepo;
	

	
	public List<Post> getAllPosts()
	{
		
		List<Post> posts = new ArrayList<>();
		postRepo.findAll().forEach(posts::add);
		
		return posts;
	}
	
	public List<Post> getPostsByUser(Long id) {
		
	return postRepo.getPostsByUserId(id);
	}
	
	
	public Optional<Post> getPost(int id) {
	
		return postRepo.findById(id); //getOne(id);
	}

	public void addPost(PostPojo postpojo) {
		User user = userRepo.findById(postpojo.getUserId()).get();
		
		
		if (user==null) {
			
		}else {
		
		Post posts = new Post();
		
		BeanUtils.copyProperties(postpojo, posts);
		posts.setUserId(user); //setUserId(user);
		postRepo.save(posts);
		}
		
		
	}

	public void updatePost(int id, Post post) {
		
		postRepo.save(post);
		
	}

	public void deletePost(int id) {
		postRepo.deleteById(id);
	}
	
}
	
