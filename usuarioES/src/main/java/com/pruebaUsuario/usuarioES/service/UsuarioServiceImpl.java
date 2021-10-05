package com.pruebaUsuario.usuarioES.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaUsuario.usuarioES.model.Usuario;
import com.pruebaUsuario.usuarioES.model.UsuarioExterno;
import com.pruebaUsuario.usuarioES.model.UsuarioInterno;
import com.pruebaUsuario.usuarioES.repository.UsuarioRepository;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {
	
    @Autowired
    UsuarioRepository repository;

    /**
     * Devuelve Usuario Externo
     */
	@Override
	public UsuarioExterno findExterno(Usuario id) {
		return repository.getUserById(id.getId());
	}

	@Override
	public UsuarioInterno findInterno(Usuario id) {
		return null;//repository.findOne(id.getId());
	}

}
