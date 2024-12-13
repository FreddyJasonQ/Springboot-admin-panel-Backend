package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelo.usuario;

@Repository
public interface usuarioRepositorio extends JpaRepository<usuario, Long> {
	
	// buscar al usuario por su email
	public usuario findByEmail(String email);
}
