/**
 * 
 */
package com.codingdojo.authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.authentication.models.Show;

/**
 * @author crist
 *
 */
@Repository
public interface ShowRepository extends CrudRepository<Show, Long> {
	
	Show findByNameAndNetwork(String name, String network);

}
