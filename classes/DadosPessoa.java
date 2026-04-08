//Dupla: Allan Maia
package oo;

import java.util.Scanner;

public class DadosPessoa {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String nome, profissao;
		int idade;
		
		System.out.println("Informe o nome: ");
		nome=sc.next();
		System.out.println("Informe a idade: ");
		idade=sc.nextInt();
		System.out.println("Informe a profissão: ");
		profissao=sc.next();
		Pessoa p1= new Pessoa(nome, idade, profissao);
		
		System.out.println("Informe o nome: ");
		nome=sc.next();
		System.out.println("Informe a idade: ");
		idade=sc.nextInt();
		System.out.println("Informe a profissão: ");
		profissao=sc.next();
		Pessoa p2= new Pessoa(nome, idade, profissao);
		
		System.out.println("|-------Pessoas-------|"
				+"\nPrimeira Pessoa");
		p1.exibirDados();
		System.out.println("\nSegunda Pessoa");
		p2.exibirDados();
		
		sc.close();
	}

}
