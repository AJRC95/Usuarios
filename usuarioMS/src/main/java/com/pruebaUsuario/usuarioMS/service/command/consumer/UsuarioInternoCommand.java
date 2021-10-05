package com.pruebaUsuario.usuarioMS.service.command.consumer;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pruebaUsuario.usuarioMS.service.command.ICommand;
import com.pruebaUsuario.usuarioMS.service.command.IParam;

@Component
public class UsuarioInternoCommand implements ICommand{

	public UsuarioInternoCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object execute(IParam parametro) throws JsonProcessingException, RestClientException {
		// TODO Auto-generated method stub
		return null;
	}

}
