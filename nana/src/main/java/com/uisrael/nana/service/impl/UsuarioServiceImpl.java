package com.uisrael.nana.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.nana.model.Usuario;
import com.uisrael.nana.repository.IUsuarioRepository;
import com.uisrael.nana.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository repo;
	
	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean insertarUsuario(Usuario nuevo) {
		// TODO Auto-generated method stub
		return repo.save(nuevo)!=null;
	}

	@Override
	public void eliminarUsuario(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Usuario actualizarUsuario(String id, Usuario updated) {
		// TODO Auto-generated method stub
		if (repo.existsById(id)) {
			updated.setIdUsuario(id);
			return repo.save(updated);
			
		}else {
			return null;
		}
	}

	@Override
	public Optional<Usuario> buscarPorId(String id) {
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
