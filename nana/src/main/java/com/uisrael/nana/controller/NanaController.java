package com.uisrael.nana.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.uisrael.nana.service.INanaService;

@Controller
public class NanaController implements Serializable{

	/**
	 * 
	 */
	@Autowired
	private INanaService srv;
	
	private static final long serialVersionUID = 1L;
	
	
}
