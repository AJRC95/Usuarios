package com.pruebaUsuario.usuarioMS.controller.impl;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.pruebaUsuario.usuarioMS.controller.contract.IUsuarioMS;
import com.pruebaUsuario.usuarioMS.model.Usuario;
import com.pruebaUsuario.usuarioMS.model.UsuarioExterno;
import com.pruebaUsuario.usuarioMS.service.contract.IUsuarioService;


@RestController
@RequestMapping("${openapi.Microservicio consultarUsuarioInterno.base-path:/v1/ms}")
public class UsuarioMSController implements IUsuarioMS{


	@Autowired
	IUsuarioService service;

	@Autowired
	HttpHeaders headers;

	private final NativeWebRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public UsuarioMSController(NativeWebRequest request) {
		this.request = request;
	}

	public Optional<NativeWebRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	
	@Override
	public ResponseEntity<?> consultarUsuarioInterno(@Valid Usuario body, @NotEmpty String fechaHora,
			@NotEmpty String ip, String hostName, String idMensaje, String macAddress) {
		
		UsuarioExterno parametrosOutput = null;

		try {

			if (body == null) {
				throw new Exception("INGRESE DATOS VALIDOS");
			}

			parametrosOutput = service.consultarUsuarioExterno(body);
			
			if(parametrosOutput==null) {
				System.out.println("usuario igual nulll ");
				return new ResponseEntity<String>("No Encontrado",HttpStatus.NO_CONTENT);
			}


		} catch (Exception ex) {
			ex.printStackTrace();
			
		}
		
		return new ResponseEntity<UsuarioExterno>(parametrosOutput,HttpStatus.OK);
	}

}
