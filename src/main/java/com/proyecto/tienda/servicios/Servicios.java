package com.proyecto.tienda.servicios;

import com.proyecto.tienda.modelo.User;
import java.util.List;


public interface Servicios {

	
	/**
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * Guarda un usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

}
