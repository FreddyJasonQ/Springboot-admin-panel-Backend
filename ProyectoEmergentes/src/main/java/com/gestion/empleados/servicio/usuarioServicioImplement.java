package com.gestion.empleados.servicio;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.gestion.empleados.dto.usuarioRegistroDTO;
import com.gestion.empleados.modelo.Rol;
import com.gestion.empleados.modelo.usuario;
import com.gestion.empleados.repositorio.usuarioRepositorio;

@Service
public class usuarioServicioImplement implements usuarioServicio {

	
	private usuarioRepositorio usuarioRepositorio;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public usuarioServicioImplement(usuarioRepositorio usuarioRepositorio) {
		super();
		this.usuarioRepositorio = usuarioRepositorio;
	}

	@Override
	public usuario guardarUsuario(usuarioRegistroDTO registroDTO) {
		usuario usuario = new usuario(registroDTO.getNombre(), 
				registroDTO.getApellido(),registroDTO.getEmail(),
				passwordEncoder.encode(registroDTO.getPassword()),Arrays.asList(new Rol("ROLE_USER")));
		return usuarioRepositorio.save(usuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		usuario usuario = usuarioRepositorio.findByEmail(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o password inválidos");
		}
		return new User(usuario.getEmail(),usuario.getPassword(), mapearAutoridadesRoles(usuario.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}

	@Override
	public List<usuario> listarUsuarios() {
		return usuarioRepositorio.findAll();
	}
	

}
