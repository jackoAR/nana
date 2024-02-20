package com.uisrael.nana.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.nana.model.Rol;
import com.uisrael.nana.repository.IRolRepository;
import com.uisrael.nana.service.IRolService;

@Service
public class RolServiceImpl implements IRolService{
	
	@Autowired
	private IRolRepository repo;
	
	@Override
	public List<Rol> listarRol() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean insertarRol(Rol nuevo) {
		// TODO Auto-generated method stub
		return repo.save(nuevo)!=null;
	}

	@Override
	public void eliminarRol(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Rol actualizarRol(String id, Rol nanaUpdate) {
		// TODO Auto-generated method stub
		if (repo.existsById(id)) {
			nanaUpdate.setIdRol(id);
			return repo.save(nanaUpdate);
			
		}else {
			return null;
		}
	}

	@Override
	public Optional<Rol> buscarPorId(String id) {
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
