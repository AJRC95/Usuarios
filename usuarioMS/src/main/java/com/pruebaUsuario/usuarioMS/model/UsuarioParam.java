package com.pruebaUsuario.usuarioMS.model;

import com.pruebaUsuario.usuarioMS.service.command.IParam;

public class UsuarioParam implements IParam {


	private UsuarioExterno externoParam;
	private Usuario usuarioParam;
	/**
	 * @return the externoParam
	 */
	public UsuarioExterno getExternoParam() {
		return externoParam;
	}
	/**
	 * @param externoParam the externoParam to set
	 */
	public void setExternoParam(UsuarioExterno externoParam) {
		this.externoParam = externoParam;
	}
	/**
	 * @return the usuarioParam
	 */
	public Usuario getUsuarioParam() {
		return usuarioParam;
	}
	/**
	 * @param usuarioParam the usuarioParam to set
	 */
	public void setUsuarioParam(Usuario usuarioParam) {
		this.usuarioParam = usuarioParam;
	}
	
	

}
