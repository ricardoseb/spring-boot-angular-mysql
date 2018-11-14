package com.proyecto.tienda.dao;



import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.List;
import com.proyecto.tienda.modelo.User;



// se ele pasan 2 parametros a Jpa Repository donde Long es el serializable
public interface Repositorio extends JpaRepository<User, Long>{

	@SuppressWarnings("unchecked")
	User save(User user);
	
//	List<User> findAll();
}
