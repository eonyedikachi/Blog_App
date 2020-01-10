package com.blog.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.app.post.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {
	
		//getAllPosts()
		//getPost(String id)
		//updatePost(Post p)
		//deletePost(Sting id)

	public List<Post> getPostsByUserId(Long userId);
	
	
}
