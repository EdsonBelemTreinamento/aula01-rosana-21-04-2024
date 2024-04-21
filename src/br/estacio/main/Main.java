package br.estacio.main;

import br.estacio.entity.Produto;
import br.estacio.util.InputOuputProduto;

public class Main {

	public static void main(String[] args) {
		try {
			
		Produto produto = new Produto(InputOuputProduto.inputId(),InputOuputProduto.inputNome(), InputOuputProduto.inputPreco(),InputOuputProduto.inputDescricao());
		
		 InputOuputProduto.mostraTodos(produto);
		
		
		}catch(Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
}
