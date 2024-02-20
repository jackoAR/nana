package com.uisrael.nana.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.uisrael.nana.service.IRolService;

@Controller
public class RolController implements Serializable{

	/**
	 * 
	 */
	@Autowired
	private IRolService srv;
	
	private static final long serialVersionUID = 1L;

}
