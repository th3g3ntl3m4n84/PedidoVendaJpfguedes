/**
 * 
 */
package com.jpfguedes.pedidovenda.model;

/**
 * @author joao.guedes
 *
 */

public enum TipoPessoa {
	
	FISICA, JURIDICA;
	
	public TipoPessoa[] getTiposPessoa() {
		return TipoPessoa.values();
	}
	
}
