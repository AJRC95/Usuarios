package com.pruebaUsuario.usuarioMS.service.contract;


import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pruebaUsuario.usuarioMS.model.Usuario;
import com.pruebaUsuario.usuarioMS.model.UsuarioExterno;

/**
 * 
 * @author Anggie JRC
 *
 */
public interface IUsuarioService {

	UsuarioExterno consultarUsuarioExterno( Usuario body) throws JsonProcessingException, RestClientException, Exception;

}
