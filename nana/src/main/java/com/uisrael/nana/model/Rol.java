package com.uisrael.nana.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "rol")
@Getter
@Setter
@NoArgsConstructor
public class Rol {
	
	@Id
	private String idRol;
	private String nombre;
	private String departamento;

}
