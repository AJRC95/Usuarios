package com.pruebaUsuario.usuarioES.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaUsuario.usuarioES.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/")
public class UsuarioController {


	

	private final UsuarioRepository repository;

	public UsuarioController(UsuarioRepository repository) {
		
		this.repository = repository;
	}

}
