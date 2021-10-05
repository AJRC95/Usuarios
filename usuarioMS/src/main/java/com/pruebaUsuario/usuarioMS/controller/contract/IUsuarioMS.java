package com.pruebaUsuario.usuarioMS.controller.contract;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pruebaUsuario.usuarioMS.model.Usuario;
import com.pruebaUsuario.usuarioMS.model.UsuarioExterno;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Validated
@Api(tags = "UsuarioMS", description = "Microservicio usuario ")
public interface IUsuarioMS {
	
	@ApiOperation(value = "UsuarioMS", nickname = "UsuarioMS", notes = "UsuarioMS", response = UsuarioExterno.class, tags = {
			"UsuarioMS", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK", response = UsuarioExterno.class),
			@ApiResponse(code = 201, message = "Created", response = Object.class) })
	
	@RequestMapping(value = "/Usuario/consulta", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	ResponseEntity<?> consultarUsuarioInterno(
			@ApiParam(value = "") @Valid @RequestBody(required = true) Usuario body,
			@ApiParam(value = "Fecha Hora", required = true) @RequestHeader(value = "fechaHora", required = true) @NotEmpty String fechaHora,
			@ApiParam(value = "IP", required = true) @RequestHeader(value = "ip", required = true) @NotEmpty String ip,
			@ApiParam(value = "Hostname") @RequestHeader(value = "hostName", required = false) String hostName,
			@ApiParam(value = "Id Mensaje") @RequestHeader(value = "idMensaje", required = false) String idMensaje,
			@ApiParam(value = "MAC Address") @RequestHeader(value = "macAddress", required = false) String macAddress);

}
