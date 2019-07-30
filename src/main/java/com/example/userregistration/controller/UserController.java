package com.example.userregistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.userregistration.domain.User;
import com.example.userregistration.repository.UserRepository;
import com.google.common.collect.Lists;


@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@RequestMapping(method = RequestMethod.GET, value ="/users")
	public List<User> getUsers(){
		List<User> users;
		 users =  Lists.newArrayList(repository.findAll());
		 return users;
	}
	
	@RequestMapping(method = RequestMethod.GET, value ="/users")
	public List<User> getUsers(@RequestParam(value="firstname") String firstName, 
			@RequestParam(value="lastname") String lastName, 
			@RequestParam(value="number") int number,
			@RequestParam(value="page") int page){
		
		 Optional<List<User>> users;
		 Pageable pageable = PageRequest.of(page+1, number);
		 users =  repository.findByFirstNameAndLastName(firstName, lastName, pageable);
		 if(users.isPresent()) {
			 return users.get();
		 }
		 else {
			 return null;
		 }
	}

}
