package com.blog.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.blog.app.user.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
		//getAllUsers()
		//getUser(String id)
		//updateUsert(Post p)
		//deleteUser(Sting id)
	
}
