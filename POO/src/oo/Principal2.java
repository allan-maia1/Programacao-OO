package oo;

public class Principal2 {

	public static void main(String[] args) {
		ContaBancaria2 conta1=new ContaBancaria2(123,"Carlos",100.00);  //conta1 é a INSTÂNCIA de um Objeto (Identidade)
														 	  //Atributos: N conta, Titular, Saldo
																	  //Dentro do () são os Valores dos atributos
		
		
		conta1.depositar(50); //Utilizando o método depositar para depositar saldo
		conta1.sacar(130);
		conta1.setTitular("");  // Conferindo se a função está resucando strings vazias
		String dados=conta1.exibirDados();
		System.out.println(dados);
	}

}