package com.gestion.empleados.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.modelo.empleado;
import com.gestion.empleados.repositorio.empleadoRepositorio;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="http://localhost:4200/")
public class empleadoControlador {

	@Autowired
	private empleadoRepositorio repositorio;
	
	@GetMapping("/empleados")
	public List<empleado> listarTodosEmpleados(){
		return repositorio.findAll();
	}
}
