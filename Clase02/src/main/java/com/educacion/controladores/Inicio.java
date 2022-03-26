package com.educacion.controladores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.educacion.entidades.Usuario;
import com.educacion.implementaciones.mariadb.UsuarioImplementacion;
import com.educacion.utilidades.Fechas;

// stereotypes repository controller service  --> Component
// M V C
@Controller
public class Inicio {
	private Logger log = LogManager.getLogger();

	// ModelAndView
	// GET POST DELETE PUT ------
	
	// inyeccion de dependencias
	// logueatr con AOP
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public ModelAndView homePage() {
		// HttpServlet setAt
		ModelAndView modelAndView = new ModelAndView();
		UsuarioImplementacion usuarioImplementacion = new UsuarioImplementacion();
		Usuario usuario = usuarioImplementacion.buscarPorID("user1@gmail.com");

		modelAndView.addObject("usuario", usuario);
		modelAndView.setViewName("homePage");
		log.debug(usuario);

		return modelAndView;
	}

}
