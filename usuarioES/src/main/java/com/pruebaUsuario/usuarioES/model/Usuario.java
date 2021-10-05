/**
 * 
 */
package com.pruebaUsuario.usuarioES.model;

import org.springframework.data.annotation.Id;

/**
 * @author Anggie JRC
 *
 */
public abstract class Usuario {

	@Id
	private String id;
	
	private String nombreUsuario;
	private String apellidoUsuario;


	public Usuario() {
		
	}
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @param id
	 * @param nombreUsuario
	 * @param apellidoUsuario
	 */
	public Usuario(String id, String nombreUsuario, String apellidoUsuario) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
	}

	
	

}
