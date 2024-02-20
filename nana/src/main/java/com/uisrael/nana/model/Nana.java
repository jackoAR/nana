package com.uisrael.nana.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "nana")
@Getter
@Setter
@NoArgsConstructor
public class Nana {
	@Id
	private String idNana;
	private String nombre;
	private String apellido;
	private Integer edad;
}
