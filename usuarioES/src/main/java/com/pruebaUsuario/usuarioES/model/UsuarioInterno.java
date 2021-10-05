/**
 * 
 */
package com.pruebaUsuario.usuarioES.model;

/**
 * @author Anggie JRC
 *
 */
public class UsuarioInterno extends Usuario {
	
	private String correoElectronico;
	private String direcionDomicilio;
	private String telefonoDomicilio;

	
	
	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}



	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}



	/**
	 * @return the direcionDomicilio
	 */
	public String getDirecionDomicilio() {
		return direcionDomicilio;
	}



	/**
	 * @param direcionDomicilio the direcionDomicilio to set
	 */
	public void setDirecionDomicilio(String direcionDomicilio) {
		this.direcionDomicilio = direcionDomicilio;
	}



	/**
	 * @return the telefonoDomicilio
	 */
	public String getTelefonoDomicilio() {
		return telefonoDomicilio;
	}



	/**
	 * @param telefonoDomicilio the telefonoDomicilio to set
	 */
	public void setTelefonoDomicilio(String telefonoDomicilio) {
		this.telefonoDomicilio = telefonoDomicilio;
	}



	/**
	 * 
	 */
	public UsuarioInterno() {
	}



	@Override
	public String toString() {
		return "UsuarioInterno [correoElectronico=" + correoElectronico + ", direcionDomicilio=" + direcionDomicilio
				+ ", telefonoDomicilio=" + telefonoDomicilio + ", getCorreoElectronico()=" + getCorreoElectronico()
				+ ", getDirecionDomicilio()=" + getDirecionDomicilio() + ", getTelefonoDomicilio()="
				+ getTelefonoDomicilio() + ", getId()=" + getId() + ", getNombreUsuario()=" + getNombreUsuario()
				+ ", getApellidoUsuario()=" + getApellidoUsuario() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}



	/**
	 * @param correoElectronico
	 * @param direcionDomicilio
	 * @param telefonoDomicilio
	 */
	public UsuarioInterno(String correoElectronico, String direcionDomicilio, String telefonoDomicilio) {
		super();
		this.correoElectronico = correoElectronico;
		this.direcionDomicilio = direcionDomicilio;
		this.telefonoDomicilio = telefonoDomicilio;
	}


	
	
	

}
