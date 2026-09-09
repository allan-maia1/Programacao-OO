package oo;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta1=new ContaBancaria(123,"João",500.00);
		ContaBancaria conta2=new ContaBancaria(456,"Maria",1000.00);
		
		conta1.depositar(200.00);
		conta2.sacar(300.00);
		
		conta1.exibirDados();
		System.out.println();
		conta2.exibirDados();
		
		conta1.sacar(800.00);
	}

} 