package com.proyecto.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TiendaApplication 


extends SpringBootServletInitializer {
	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(TiendaApplication.class);
	    }
	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}
}
