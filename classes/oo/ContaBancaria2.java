package oo;

public class ContaBancaria2 {  //CLASSE --- Tudo fica DENTRO da chave da CLASSE
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria2(int numero, String titular, double saldo) {  //MÉTODO CONSTRUTOR - Dentro do método há prioridade 
		this.numero=numero;                                           //dos parâmetros sobre os atributos, então utiliza-se
		this.titular=titular;										  // .this para referenciar ao Objeto
		this.saldo=saldo;
	}
	
	void depositar(double valor){
		this.saldo+=valor;
	}
	void sacar(double valor){
		if(valor>0) {
			if(valor>this.saldo) {
				System.out.println("Saldo Insuficiente");
			}else {
				this.saldo-=valor;
			}
		}else {
			System.out.println("Valor inválido");
		}
	}
	String exibirDados() {
		String msg= "Número da Conta: "+ this.numero + "\nNome do Titular: "+ this.titular + "\nSaldo: "+ this.saldo;
		return msg;
	}
	
	public String getTitular() {  // Métodos GET RETORNAM valores. Serve para PUXAR o valor do atributos
		return titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setTitular(String novoNome) {  //Métodos SET servem para MODIFICAR valores dos atributos
		if(!novoNome.isBlank()) {  //Permite apenas Strings preenchidas
			this.titular=novoNome;			
		}
	}
}