package com.blog.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.app.post.Post;

@Service
public class PostService {
	
	private List<Post> posts = new ArrayList<>(Arrays.asList(
			
			new Post("intro", "Introduction to Programming", "Short note on Programming"),
			new Post("java", "Introduction to Java", "Short note on Java Data Types"),
			new Post("javascript", "JavaScript Best Practice", "Best Practices for writing clean JavaScript codes")
			));
	
	public List<Post> getAllPosts()
	{
		return posts;
	}
	
	public Post getPost(String id) {
		return posts.stream().filter(t-> t.getId().equals(id)).findFirst()
					.get();	}

	public void addPost(Post post) {
		posts.add(post);
		
	}

	public void updatePost(String id, Post post) {
	 
		for (int i = 0;i < posts.size(); i++) {
			Post t = posts.get(i);
			if (t.getId().equals(id)) {
				posts.set(i, post);
				return;
			}
		}
		
	}

	public void deletePost(String id) {
		posts.removeIf(t -> t.getId().equals(id));
	}
}
	
