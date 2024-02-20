package com.uisrael.nana.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.nana.model.Nana;

public interface INanaService {
	
	public List<Nana> listarNana();
	public boolean insertarNana(Nana nuevo);
	public void eliminarNana(String id);	
	public Nana actualizarNana(String id, Nana nanaUpdate);
	public Optional<Nana> buscarPorId(String id);
}
