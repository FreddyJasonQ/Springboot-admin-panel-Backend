package com.gestion.empleados.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestion.empleados.dto.usuarioRegistroDTO;
import com.gestion.empleados.servicio.usuarioServicio;

@Controller
@RequestMapping("/registro")
public class registroUsuarioControlador {

	private usuarioServicio usuarioServicio;

	public registroUsuarioControlador(com.gestion.empleados.servicio.usuarioServicio usuarioServicio) {
		super();
		this.usuarioServicio = usuarioServicio;
	}
	
	@ModelAttribute("usuario")
	public usuarioRegistroDTO retornarNuevoUsuario() {
		return new usuarioRegistroDTO();
	}
	
	@GetMapping
	public String mostrarForumularioRegistro() {		
		return "registro";		
	}
	     
	
	@PostMapping
	public String registrarCuentaUsuario(@ModelAttribute("usuario") usuarioRegistroDTO registroDTÔ) {
		usuarioServicio.guardarUsuario(registroDTÔ);
		return "redirect:/registro?exito";
	}
	
	
	
	
}