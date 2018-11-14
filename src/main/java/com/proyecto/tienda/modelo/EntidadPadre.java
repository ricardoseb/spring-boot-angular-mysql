package com.proyecto.tienda.modelo;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
//le digo que es una super clase

@MappedSuperclass
@Access(AccessType.FIELD) //las anotaciones se ponen sobre el campo
public class EntidadPadre implements Serializable{


	private static final long serialVersionUID = 3404171706436689794L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)// accede al atributo id
	@Column(name= "id", unique=true, nullable=false)  //tal como sale en la base de datos
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
