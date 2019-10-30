package com.blog.app.service;

import java.util.ArrayList;

import java.util.List;

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
	
	public void getUser(int id) {
	
		userRepo.getOne(id);
	}

	public void createUser(User user) {
		userRepo.save(user);
		
	}

	public void updateUser(int id, User user) {
		
		userRepo.save(user);
		
	}

	public void deleteUser(int id) {
		userRepo.deleteById(id);
	}
	
}
	
