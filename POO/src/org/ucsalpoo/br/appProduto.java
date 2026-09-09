//Allan Maia e Yago Lobão
package org.ucsalpoo.br;

import java.util.Random;
import java.util.Scanner;

public class appProduto {
	public static void main(String[] args) {
		int opc,qntd;
		Random random = new Random();
		Produto p1=new Produto("Camiseta",1,random.nextInt(50),49.90);
		Produto p2=new Produto("Calça Jeans",2,random.nextInt(50),119.90);
		Produto p3=new Produto("Tênis Esportivo",3,random.nextInt(50),229.90);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---MENU---\n"
				+ "1- Camiseta: R$ 49,90\n"
				+ "2- Calça Jeans: R$ 119,90\n"
				+ "3- Tênis Esportivo: R$ 229,90");
		System.out.println("Escolha uma opção: ");
		opc=sc.nextInt();
		switch (opc){
		case 1:
			System.out.println("Informe a quantidade: ");
			qntd=sc.nextInt();
			if(qntd>p1.getQuantidade()) {
				System.out.println("Sem estoque!");
			}else {
				System.out.println("Código: "+p1.getCodigo() + "\nNome: "+ p1.getNome() +"\nPreço: R$"+ p1.getPreco());
			System.out.println("Total: " + qntd*49.90);
			}
		
			break;
		case 2:
			System.out.println("Informe a quantidade: ");
			qntd=sc.nextInt();
			if(qntd>p2.getQuantidade()) {
				System.out.println("Sem estoque!");
			}else {
				System.out.println("Código: "+p2.getCodigo() + "\nNome: "+ p2.getNome() +"\nPreço: R$"+ p2.getPreco());
			System.out.println("Total: " + qntd*119.90);
			}
			break;
		case 3:
			System.out.println("Informe a quantidade: ");
			qntd=sc.nextInt();
			if(qntd>p3.getQuantidade()) {
				System.out.println("Sem estoque!");
			}else {
				System.out.println("Código: "+p3.getCodigo() + "\nNome: "+ p3.getNome() +"\nPreço: R$"+ p3.getPreco());
			System.out.println("Total: R$ " + qntd*229.90);
			}
			break;
		default:
			System.out.println("Produto não encontrado");
			break;
		}
		sc.close();
	}

}
