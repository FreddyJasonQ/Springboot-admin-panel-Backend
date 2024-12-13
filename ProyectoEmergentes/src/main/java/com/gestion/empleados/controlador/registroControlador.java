package com.gestion.empleados.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gestion.empleados.servicio.usuarioServicio;

@Controller
public class registroControlador {

	@Autowired
	private usuarioServicio servicio;
	
	// cuando entre a la aplicacion reotorna archivo html llamado login
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaInicio(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "index";
	}
}
