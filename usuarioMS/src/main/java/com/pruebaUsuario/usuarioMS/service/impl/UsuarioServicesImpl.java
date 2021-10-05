package com.pruebaUsuario.usuarioMS.service.impl;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.pruebaUsuario.usuarioMS.model.Usuario;
import com.pruebaUsuario.usuarioMS.model.UsuarioExterno;
import com.pruebaUsuario.usuarioMS.model.UsuarioParam;
import com.pruebaUsuario.usuarioMS.service.command.consumer.UsuarioExternoCommand;
import com.pruebaUsuario.usuarioMS.service.command.consumer.UsuarioInternoCommand;
import com.pruebaUsuario.usuarioMS.service.contract.IUsuarioService;

@Service
public class UsuarioServicesImpl implements IUsuarioService{


	@Autowired
	UsuarioExternoCommand usuarioExtCmd;
	
	@Autowired
	UsuarioInternoCommand usuarioIntCmd;
	
	@Override
	public UsuarioExterno consultarUsuarioExterno(Usuario body) throws Exception {
		
		UsuarioExterno responseUsuario = null;
		
		UsuarioParam usuarioInput = null ;
		
		if("externo".equals(body.getTipoUser())) {
			
			responseUsuario = (UsuarioExterno) usuarioExtCmd.execute(usuarioInput);
		}
		
		return responseUsuario;
	}

	

}
