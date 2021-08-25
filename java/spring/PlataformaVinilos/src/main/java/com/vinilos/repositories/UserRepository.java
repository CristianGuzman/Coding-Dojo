/**
 * 
 */
package com.vinilos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vinilos.models.User;

/**
 * @author crist
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByEmail(String email);

}
