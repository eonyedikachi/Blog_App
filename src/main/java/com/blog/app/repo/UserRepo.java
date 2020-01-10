package com.blog.app.repo;





import org.springframework.data.jpa.repository.JpaRepository;


import com.blog.app.user.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
		//getAllUsers()
		//getUser(String id)
		//updateUser(Post p)
		//deleteUser(Sting id)
	public User getUserByUserId(Long userId);
	
}
