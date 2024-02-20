package com.uisrael.nana.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "usuario")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {
	
	@Id
	private String idUsuario;
	private String password;
	private String alias;
	private String correo;
}
