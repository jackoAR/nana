package com.uisrael.nana.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.nana.model.Usuario;

public interface IUsuarioRepository extends MongoRepository<Usuario, String>{
	
	public Optional<Usuario> findByIdUsuario(String id);
}
