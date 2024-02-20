package com.uisrael.nana.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.uisrael.nana.service.IUsuarioService;

@Controller
public class UsuarioController implements Serializable{

	/**
	 * 
	 */
	@Autowired
	private IUsuarioService srv;
	
	private static final long serialVersionUID = 1L;

}
