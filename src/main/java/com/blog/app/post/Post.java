package com.blog.app.post;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.blog.app.user.User;

@Entity
public class Post {
	
	@Id
	private int postId;
	
	@Column(nullable=false)
	private String title;
	
	private String description;
	
	@Column(nullable=false)
	private String content;
	
	private String postImage;
	
	@ManyToOne
	private User userId;
	
	
	
	public int getPostId() {
		return postId;
	}


	public void setPostId(int postId) {
		this.postId = postId;
	}


	
	

	public Post() {
	}


	public Post(int postId, String title, String description, String content, String postImage, int userId ) {
		super();
		this.postId = postId;
		this.title = title;
		this.description = description;
		this.content = content;
		this.postImage = postImage;
		this.userId = new User(userId);
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getPostImage() {
		return postImage;
	}


	public void setPostImage(String postImage) {
		this.postImage = postImage;
	}


	public User getUserId() {
		return userId;
	}


	public void setUserId(User userId) {
		this.userId = userId;
	}




}
