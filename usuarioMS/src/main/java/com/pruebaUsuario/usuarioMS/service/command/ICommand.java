package com.pruebaUsuario.usuarioMS.service.command;

import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonProcessingException;



public interface ICommand {
	
	/**
	 * @param parametro
	 * @return
	 * @throws ApplicationException
	 * @throws JsonProcessingException
	 * @throws RestClientException
	 * @throws Exception 
	 */
	Object execute(IParam parametro) throws JsonProcessingException,RestClientException, Exception;

}
