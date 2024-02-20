package com.uisrael.nana.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.nana.model.Nana;
import com.uisrael.nana.repository.INanaRepository;
import com.uisrael.nana.service.INanaService;

@Service
public class NanaServiceImpl implements INanaService{
	
	@Autowired
	private INanaRepository repo;
	
	@Override
	public List<Nana> listarNana() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean insertarNana(Nana nuevo) {
		// TODO Auto-generated method stub
		return repo.save(nuevo) != null;
	}

	@Override
	public void eliminarNana(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Nana actualizarNana(String id, Nana nanaUpdate) {
		// TODO Auto-generated method stub
		if (repo.existsById(id)) {
			nanaUpdate.setIdNana(id);
			return repo.save(nanaUpdate);
			
		}else {
			return null;
		}
	}

	@Override
	public Optional<Nana> buscarPorId(String id) {
		// TODO Auto-generated method stub
		try {
			return repo.findById(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Optional.empty();
		}
	}

}
