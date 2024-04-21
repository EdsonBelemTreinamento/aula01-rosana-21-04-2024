package br.estacio.util;

import javax.swing.JOptionPane;

import br.estacio.entity.Produto;

public class InputOuputProduto {
 
	
	public static Integer inputId() throws Exception {
		try {
		  Integer id = new Integer(JOptionPane.showInputDialog("Entre com Id:"));
			return id;
		}catch(Exception ex){
			throw new IllegalArgumentException("Error no Id :" + ex.getMessage());
		}
	}
	public static String inputNome() throws Exception {
		try {
			String nome =  JOptionPane.showInputDialog("entre com nome:");
			return nome;
		}catch(Exception ex){
			throw new IllegalArgumentException("Error no nome :" + ex.getMessage());
		}
	}
	
	public static Double inputPreco() throws Exception {
		try {
			Double preco =  new Double(JOptionPane.showInputDialog("Entre com preco:"));
			return preco;
		}catch(Exception ex){
			throw new IllegalArgumentException("Error no preco :" + ex.getMessage());
		}
	}
	
	
	public static String inputDescricao() throws Exception {
		try {
			String descricao =   JOptionPane.showInputDialog("Entre com descricao:");
			return descricao;
		}catch(Exception ex){
			throw new IllegalArgumentException("Error no descricao :" + ex.getMessage());
		}
	}
	
	public static void mostraTodos(Produto produto)throws Exception{
		try {
		
	    JOptionPane.showMessageDialog(null, produto.toString());
		}
		catch(Exception ex) {
			throw new IllegalArgumentException("Error na Impressao" + ex.getMessage());
		}
	}
	
	
	
}
