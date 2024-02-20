package com.uisrael.nana;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.nana.model.Nana;
import com.uisrael.nana.service.INanaService;

@SpringBootTest
class NanaApplicationTests {
	
	@Autowired
	private INanaService srv;
	
	@Test
	void contextLoads() {
		
		Nana nueva = new Nana();
		nueva.setNombre("Maria");
		nueva.setApellido("Torres");
		nueva.setEdad(21);	
		
		
		srv.insertarNana(nueva);
	}

}
