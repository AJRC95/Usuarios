package com.pruebaUsuario.usuarioES.repository;

import com.pruebaUsuario.usuarioES.model.UsuarioExterno;
import com.pruebaUsuario.usuarioES.model.UsuarioInterno;

public interface UsuarioRepository {

	//@Query("{ 'id' : ?0 }")
	//UsuarioExterno findOne(String id);

	UsuarioExterno getUserById(String id);


	//@Query("{ 'id' : ?0 }")
	//UsuarioInterno findInterno(String id);
	
	UsuarioInterno getUserById1(String id);

}
