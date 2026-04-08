//Dupla: Allan Maia
package oo;

public class Pessoa {
	String nome, profissao;
	int idade;
	
	public Pessoa(String nome, int idade, String profissao) {
		this.nome=nome;
		this.idade=idade;
		this.profissao=profissao;
	}
	
	void exibirDados() {
		System.out.println("Nome: "+ nome + "\nIdade: "+idade + "\nProfissão: "+ profissao);
	}
}
