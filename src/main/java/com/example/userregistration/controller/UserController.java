package com.example.userregistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.userregistration.domain.User;
import com.example.userregistration.repository.UserRepository;
import com.google.common.collect.Lists;


@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	
	@RequestMapping(method = RequestMethod.GET, value ="/users")
	public ResponseEntity<List<User>> getUsersByInput(@RequestParam(value="firstname") String firstName, 
			@RequestParam(value="lastname") String lastName, 
			@RequestParam(value="number") int number,
			@RequestParam(value="page") int page){
		
		if(firstName == null) {
			List<User> users;
			 users =  Lists.newArrayList(repository.findAll());
			 return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		}
		else {
		 Optional<List<User>> users;
		 Pageable pageable = PageRequest.of(page+1, number);
		 users =  repository.findByFirstNameAndLastName(firstName, lastName, pageable);
		 if(users.isPresent()) {
			 return new ResponseEntity<List<User>>(users.get(), HttpStatus.OK);
		 }
		 else {
			 return null;
		 }
		}
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/users")
	public ResponseEntity updateUsersByInput(@RequestParam(value="firstname") String firstName, 
			@RequestParam(value="lastname") String lastName, 
			@RequestParam(value="email") String email,
			@RequestParam(value="telephone") String telephone,
			@RequestParam(value="address") String address){
		
		User user = new User(firstName, lastName, address, telephone, email);
		repository.save(user);
		return new ResponseEntity(HttpStatus.OK);
	}

}
