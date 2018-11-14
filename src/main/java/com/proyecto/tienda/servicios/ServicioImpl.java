package com.proyecto.tienda.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.tienda.dao.Repositorio;
import com.proyecto.tienda.modelo.User;



@Service
public class ServicioImpl implements Servicios {
	
	@Autowired // inyecto 
	protected Repositorio repositorio;
	
	public User save(User user) {
		return this.repositorio.save(user);
	}

	@Override
	public java.util.List<User> findAll() {
		
		return this.repositorio.findAll();
	}

	
}
