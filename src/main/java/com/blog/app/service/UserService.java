package com.blog.app.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.app.user.User;
import com.blog.app.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	

	
	public List<User> getAllUsers()
	{
		
		List<User> users = new ArrayList<>();
		userRepo.findAll().forEach(users::add);
		return users;
	}
	
	//@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="user")
	public Optional<User> getUser(Long id) {
		
	
		return userRepo.findById(id);
	}

	public void createUser(User user) {
		userRepo.save(user);
		
	}

	public void updateUser(Long id, User user) {
		
		userRepo.save(user);
		
		
		
	}

	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}
	
}
	
