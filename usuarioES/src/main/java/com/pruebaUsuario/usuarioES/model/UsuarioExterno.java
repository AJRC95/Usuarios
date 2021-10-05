/**
 * 
 */
package com.pruebaUsuario.usuarioES.model;

/**
 * @author Anggie JRC
 *
 */
public class UsuarioExterno extends Usuario {

	private String telefonoEmpresa;
	private String nombreEmpresa;
	private String direccionEmpresa;
	
	
	
	/**
	 * @return the telefonoEmpresa
	 */
	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}



	/**
	 * @param telefonoEmpresa the telefonoEmpresa to set
	 */
	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}



	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}



	/**
	 * @return the direccionEmpresa
	 */
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}



	/**
	 * @param direccionEmpresa the direccionEmpresa to set
	 */
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}



	/**
	 * 
	 */
	public UsuarioExterno() {
	}



	/**
	 * @param telefonoEmpresa
	 * @param nombreEmpresa
	 * @param direccionEmpresa
	 */
	public UsuarioExterno(String telefonoEmpresa, String nombreEmpresa, String direccionEmpresa) {
		super();
		this.telefonoEmpresa = telefonoEmpresa;
		this.nombreEmpresa = nombreEmpresa;
		this.direccionEmpresa = direccionEmpresa;
	}
	
	

}
