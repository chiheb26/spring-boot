package com.spring.boot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.model.User;
import com.spring.boot.repository.UserRepository;
import com.spring.boot.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findOne(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public String deleteUser(Long id) {
		userRepository.deleteById(id);
		return "{'message':'User deleted successfully.'}";
	}

}
