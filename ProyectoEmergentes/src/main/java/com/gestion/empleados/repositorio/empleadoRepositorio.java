package com.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.modelo.empleado;

@Repository
public interface empleadoRepositorio extends JpaRepository<empleado, Long>{
	
	
}
