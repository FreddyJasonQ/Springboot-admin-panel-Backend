package com.gestion.empleados.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gestion.empleados.dto.usuarioRegistroDTO;
import com.gestion.empleados.modelo.usuario;

public interface usuarioServicio extends UserDetailsService{

	public usuario guardarUsuario(usuarioRegistroDTO registroDTO);
	public List<usuario> listarUsuarios();
}
