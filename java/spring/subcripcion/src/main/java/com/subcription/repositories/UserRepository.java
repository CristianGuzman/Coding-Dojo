package com.subcription.repositories;

import org.springframework.data.repository.CrudRepository;

import com.subcription.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByEmail(String email);

}
