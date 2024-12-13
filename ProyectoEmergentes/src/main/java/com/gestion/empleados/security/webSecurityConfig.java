package com.gestion.empleados.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.gestion.empleados.servicio.usuarioServicio;

@Configuration
@EnableWebSecurity
public class webSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	@Lazy
	private usuarioServicio usuarioServicio;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(usuarioServicio);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.cors().and() // Habilita CORS
	        .authorizeRequests()
	        .antMatchers(
	            "/registro**",
	            "/js/**",
	            "/css/**",
	            "/img/**",
	            "/api/v1/empleados/**", // Permitir acceso sin autenticación
	            "/api/customers/**",
	            "/api/orders/**"
	        ).permitAll()
	        .anyRequest().authenticated()
	        .and()
	        .formLogin()
	        .loginPage("/login")
	        .defaultSuccessUrl("http://localhost:4200", true)
	        .permitAll()
	        .and()
	        .logout()
	        .invalidateHttpSession(true)
	        .clearAuthentication(true)
	        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	        .logoutSuccessUrl("/login?logout")
	        .permitAll();
	}
}














