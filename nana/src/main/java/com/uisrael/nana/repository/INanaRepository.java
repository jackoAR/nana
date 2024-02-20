package com.uisrael.nana.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.nana.model.Nana;

public interface INanaRepository extends MongoRepository<Nana, String> {
	public Optional<Nana> findByIdNana(String id);
}
