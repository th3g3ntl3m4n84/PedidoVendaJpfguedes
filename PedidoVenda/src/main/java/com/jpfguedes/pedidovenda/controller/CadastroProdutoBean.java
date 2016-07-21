/**
 * 
 */
package com.jpfguedes.pedidovenda.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.jpfguedes.pedidovenda.model.Produto;

/**
 * @author joao.guedes
 *
 */

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto;
	
	public CadastroProdutoBean() {
		produto = new Produto();
	}

	public void salvar() {
		
	}

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

}
