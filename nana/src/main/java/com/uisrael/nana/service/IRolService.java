package com.uisrael.nana.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.nana.model.Rol;

public interface IRolService {
	
	public List<Rol> listarRol();
	public boolean insertarRol(Rol nuevo);
	public void eliminarRol(String id);	
	public Rol actualizarRol(String id, Rol updated);
	public Optional<Rol> buscarPorId(String id);
}
