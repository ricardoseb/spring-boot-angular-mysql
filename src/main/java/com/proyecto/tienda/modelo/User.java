package com.proyecto.tienda.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // le decimos que esta clase e suna entidad
@Table(name= "users") // nombre de la tabla
@Access(AccessType.FIELD)//las anotaciones se ponen sobre el campo
public class User extends EntidadPadre{

	private static final long serialVersionUID = -6161781314382359854L;
	
	@Column(name = "nombre", nullable=false, length=255) // indico a que columna apunta
	 private String nombre;
	
	@Column(name = "ap_paterno", nullable=false, length=255)
	 private String ap_paterno;
	
	@Column(name = "ap_materno", length=255)
	 private String ap_materno;
	
	 @Column(name = "telefono", length=45)
	 private String telefono;
	
	@Column(name = "email", nullable=false, length=255)
	 private String email;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAp_paterno() {
		return ap_paterno;
	}
	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}
	public String getAp_materno() {
		return ap_materno;
	}
	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
