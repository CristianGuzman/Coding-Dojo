/**
 * 
 */
package com.eventos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventos.models.Evento;

/**
 * @author crist
 *
 */
public interface EventosRepositories extends CrudRepository<Evento, Id> {

}
