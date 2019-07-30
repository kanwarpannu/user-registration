package com.example.userregistration.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.userregistration.domain.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	
	Optional<List<User>> findByFirstNameAndLastName(String firstName,String lastName, Pageable pageable);
	Optional<List<User>> findByLastName(String lastName);
	Optional<List<User>> findByFirstName(String firstName);
	Optional<List<User>> findByEmail(String email);

}
