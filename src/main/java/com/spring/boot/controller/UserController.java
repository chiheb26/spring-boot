package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.boot.model.User;
import com.spring.boot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}
	@RequestMapping("/add")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@RequestMapping("/list/{id}")
	public User findOne(@PathVariable Long id){
		return userService.findOne(id);
	}
	
	@RequestMapping("/list")
	public List<User> userList(){
		return userService.userList();
	}
}
