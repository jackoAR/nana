package com.uisrael.nana.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.nana.model.Rol;

public interface IRolRepository extends MongoRepository<Rol, String> {
	
	public Optional<Rol> findByIdRol(String id);
}
