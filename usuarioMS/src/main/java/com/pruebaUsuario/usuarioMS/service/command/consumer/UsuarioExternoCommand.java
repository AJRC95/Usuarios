package com.pruebaUsuario.usuarioMS.service.command.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pruebaUsuario.usuarioMS.model.UsuarioExterno;
import com.pruebaUsuario.usuarioMS.model.UsuarioParam;
import com.pruebaUsuario.usuarioMS.service.command.ICommand;
import com.pruebaUsuario.usuarioMS.service.command.IParam;

public class UsuarioExternoCommand implements ICommand{

	@Value("${UriEsUsuario}")
	private String uriUser;

	@Autowired
	HttpHeaders headers;

	@Override
	public Object execute(IParam parametro) throws Exception {
		UsuarioParam input = (UsuarioParam) parametro;

		RestTemplate restTemplate = new RestTemplate();
		UsuarioExterno externoOut;
		

		try {

			HttpEntity<String> entity = new HttpEntity<>("headers", headers);

			ResponseEntity<UsuarioExterno> response = restTemplate.exchange(
					uriUser.concat("/v1/usuarioES/{id}"), HttpMethod.GET, entity,
					new ParameterizedTypeReference<UsuarioExterno>() {
					}, input.getUsuarioParam());

			externoOut = response.getBody();

			if (externoOut == null) {
				throw new Exception("NO EXISTEN REGISTROS");
			}

		} catch (HttpStatusCodeException e) {

			throw new Exception("A OCURRIDO UN ERROR USUARIO", e);

		} catch (ResourceAccessException e) {
			throw new Exception("NO PUDIMOS ACCEDER A USUARIO EXTERNO",
					 e);
		}

		return externoOut;
	}

}
