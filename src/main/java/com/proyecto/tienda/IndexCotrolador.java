package com.proyecto.tienda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCotrolador {

		@RequestMapping("/")
		public String getIndexPage() {
			return "index";
			
		}
}
