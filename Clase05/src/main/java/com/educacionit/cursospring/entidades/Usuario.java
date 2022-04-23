package com.educacionit.cursospring.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Usuario {
	@Id
	private Integer id;
	private String correo;
	private String clave;
}
