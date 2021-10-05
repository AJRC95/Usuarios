/**
 * 
 */
package com.pruebaUsuario.usuarioES.model;

/**
 * @author Anggie JRC
 *
 */
public class FactoriaUsuario {

	/**
	 * @param tipo
	 * @return
	 */
	public static Usuario getUsuario(String tipo) {
		
		if ("interno".equals(tipo)) {
			return new UsuarioInterno();
		} else {
			return new UsuarioExterno();
		}
		
	}

}
