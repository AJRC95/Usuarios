package com.pruebaUsuario.usuarioES.service;

import com.pruebaUsuario.usuarioES.model.Usuario;
import com.pruebaUsuario.usuarioES.model.UsuarioExterno;
import com.pruebaUsuario.usuarioES.model.UsuarioInterno;

/**
 * 
 * @author Anggie JRC
 *
 */
public interface UsuarioService {
	
	public UsuarioExterno findExterno(Usuario id);

	public UsuarioInterno findInterno(Usuario id);

}
