/**
 * 
 */
package com.jpfguedes.pedidovenda.model;

/**
 * @author joao.guedes
 *
 */

public enum StatusPedido {
	
	ORCAMENTO, EMITIDO, CANCELADO;
	
	
	public StatusPedido[] getStatusPedidos() {
		return StatusPedido.values();
	}
}
