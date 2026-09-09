package org.ucsalpoo.br;

public class Produto {
	private String nome;
	private int codigo;
	private int quantidade;
	private double preco;
	
	
	public Produto(String nome, int codigo, int quantidade, double preco) {
		this.nome=nome;
		this.codigo=codigo;
		this.quantidade=quantidade;
		this.preco=preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String exibirInformacoes(String nome, int codigo, int quantidade, double preco) {
		return "Nome: "+ this.nome + "Código: " + this.codigo + "Quantidade: " + this.quantidade + "Preço: "+ this.preco;
	}
	public boolean saida(int quantidade) {
		if(quantidade<=this.quantidade) {
			this.quantidade-=quantidade;
			return true;
		}else {
			return false;
		}
	}
}


