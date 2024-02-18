package com.uisrael.nana.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Nana {
	@Id
	private String idNana;
	private String nombre;
	private String apellido;
	private Integer edad;
}
