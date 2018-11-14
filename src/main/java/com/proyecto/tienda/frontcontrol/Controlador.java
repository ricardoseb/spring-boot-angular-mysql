package com.proyecto.tienda.frontcontrol;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.tienda.servicios.Servicios;
//import com.proyecto.tienda.util.QueryResultado;
import com.proyecto.tienda.util.RestRespuesta;

import java.util.List;

import com.proyecto.tienda.modelo.User;

@RestController //indico que es un controlador
public class Controlador {
	
	@Autowired
	protected Servicios userService;
	
	protected ObjectMapper mapper; //para leer y escribir JSON
	
	//con esto gaurdamos o actualizamos registros
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST) //con que url queremos que nos invoque
	public RestRespuesta saveOrUpdate(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();
		User user = this.mapper.readValue(userJson, User.class);
		if (!this.validate(user)) {
			return new RestRespuesta(HttpStatus.NOT_ACCEPTABLE.value(), "Error con los Campos obligatorios");
		}
		this.userService.save(user);
		return new RestRespuesta(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	
	// obtencio de usuarios
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return this.userService.findAll();
		
	}
	
	
	
	
	private boolean validate (User user) {
		boolean esValido = true;
		if (user.getNombre()==null || user.getNombre()=="") {
			esValido= false;	
		}
		if (user.getAp_paterno()==null || user.getAp_paterno()=="") {
			esValido= false;	
		}
		return esValido;
	}
}
