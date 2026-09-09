package heranca;

public class Conta {
	 private int numConta;
	 private String nomeCorrentista;
	 protected double saldo;

	public Conta(int numConta, String nomeCorrentista, double saldo){
		this.numConta=numConta;
		this.nomeCorrentista=nomeCorrentista;
		this.saldo=saldo;
	}
	
	double depositar(double valor){
		return saldo+=valor;
		}
	
	double sacar(double valor){
		if(valor<=this.saldo) {
			this.saldo-=valor;
		}
		return this.saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}
	public int getNumConta() {
		return this.numConta;
	}
	public String getNomeCorrentista() {
		return this.nomeCorrentista;
	}
	
}