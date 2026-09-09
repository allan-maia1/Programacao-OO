package oo;

public class ContaBancaria {
	int numero;
	String titular;
	double saldo;
	
	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero=numero;
		this.titular=titular;
		this.saldo=saldo;
	}
	
	double depositar(double valor){
	return saldo+=valor;
	}
	double sacar(double valor){
		if(valor>saldo) {
			System.out.println("Saldo Insuficiente");
		}else {
			saldo-=valor;
		}
		return saldo;
	}
	void exibirDados() {
		System.out.println("Número da Conta: "+ numero + "\nNome do Titular: "+titular + "\nSaldo: "+ saldo);
	}
}