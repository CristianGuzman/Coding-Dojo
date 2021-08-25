package com.eventos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eventos.models.Usuario;

public interface UsuarioRepositorie extends CrudRepository<Usuario, Userid> {

}
