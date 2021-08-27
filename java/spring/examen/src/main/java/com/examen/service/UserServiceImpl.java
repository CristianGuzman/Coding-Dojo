package com.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.User;
import com.examen.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userrepository;
	
	private boolean checkPasswordValid(User user) throws Exception {
		if ( !user.getPassword().equals(user.getPasswordConfirmation())) {
			throw new Exception("Password y Confirm Password no son iguales");
		}
		return true;
	}
	
	

}
