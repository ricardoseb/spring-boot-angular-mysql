package com.proyecto.tienda;



import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfiguracion implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
    	registry.scriptTemplate().prefix("/tienda/src/").suffix(".html");
    }
}
