package com.uisrael.nana.service;

import java.util.List;
import java.util.Optional;

import com.uisrael.nana.model.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listarUsuario();
	public boolean insertarUsuario(Usuario nuevo);
	public void eliminarUsuario(String id);	
	public Usuario actualizarUsuario(String id, Usuario updated);
	public Optional<Usuario> buscarPorId(String id);
}
