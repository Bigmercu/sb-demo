package com.victornieto.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {

	@Id
	private String id ;
	private String nombre ;
	private String apellido ;
	private String password ;

}
