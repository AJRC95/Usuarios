/**
 * 
 */
package com.pruebaUsuario.usuarioMS.model;

/**
 * @author Anggie JRC
 *
 */
public class Usuario {

	private String idUsuario;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String tipoUser;


	public Usuario() {
		
	}
	
	/**
	 * @return the idUsuario
	 */
	public String getIdUsuario() {
		return idUsuario;
	}


	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}


	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}


	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	/**
	 * @return the apellidoUsuario
	 */
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}


	/**
	 * @param apellidoUsuario the apellidoUsuario to set
	 */
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	/**
	 * @return the tipoUser
	 */
	public String getTipoUser() {
		return tipoUser;
	}

	/**
	 * @param tipoUser the tipoUser to set
	 */
	public void setTipoUser(String tipoUser) {
		this.tipoUser = tipoUser;
	}

	public Usuario(String nombreUsuario, String apellidoUsuario, String tipoUser) {
	    this.nombreUsuario = nombreUsuario;
	    this.apellidoUsuario = apellidoUsuario;
	    this.tipoUser = tipoUser;
	  }
	
	

}
